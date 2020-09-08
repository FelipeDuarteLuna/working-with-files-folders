package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;


import entity.Product;

public class Exercicio_CSV {
	public static void main(String[]args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Informar o caminho do arquivo .CSV: ");
		String sourceFile  = sc.nextLine(); // C:\Users\felipe.luna\Music\summary.csv
		
		File patch = new File(sourceFile );
		String caminho = patch.getParent();
		String targetFileStr = caminho + "\\out\\summary_NEW.csv"; 
		
		boolean success = new File(caminho + "\\out").mkdir();
		System.out.println("Directory created successfully " + success);
		
		try (BufferedReader br = new BufferedReader(new FileReader (patch))){
						
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				String [] fields =  line.split(";");
				
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
						
				line = br.readLine();
			}
			
			System.out.println("Products: ");
			for(Product x : list) {
				System.out.println(x.toString());
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr, true))){
				for (Product y : list) {
					bw.write(y.getName() + "," +  String.format("%.3f", y.Total()));
					bw.newLine();
				}
			}catch(IOException e){
				System.out.println("Error : " + e.getMessage());
				e.getStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error reading file: " + e.getMessage());

		}finally {
			sc.close();
		}
		
	}
}
