package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class try_with_resources {
	public static void main(String[]args) {
		
		String patch = "c:\\\\temp\\\\inp_out_file_class.xml";
		
		/* É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco
			• Disponível no Java 7 em diante
			• https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		 */
		try(BufferedReader br = new BufferedReader(new FileReader (patch))){
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
