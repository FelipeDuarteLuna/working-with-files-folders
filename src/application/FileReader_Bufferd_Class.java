package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Bufferd_Class {
	public static void main(String[]args) {
		
		String patch = "c:\\temp\\inp_out_file_class_.xml";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(patch);
			br = new BufferedReader(fr);
			//br = new BufferedReader(new FileReader(patch));
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				
				if (fr != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
