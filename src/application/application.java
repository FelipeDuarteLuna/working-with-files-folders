package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class application {
	public static void main(String[]args) {
		
		
		Scanner sc = null;
		try {
			File arquivo = new File("c:\\temp\\inp_out_file_class.xml");
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}finally {
			if (sc != null) {
				sc.close();
			}
		}
		
	}

}
