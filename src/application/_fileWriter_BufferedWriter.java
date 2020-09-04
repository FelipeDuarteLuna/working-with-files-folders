package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _fileWriter_BufferedWriter {
	public static void main(String[]args) {
		
		String[] lines = new String [] {"Good morning", "Good afternoon", "Good night"};
		
		String patch = "c:\\temp\\out_fileWrite.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(patch, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e){
			System.out.println("Error : " + e.getMessage());
			e.getStackTrace();
		}
	}

}
