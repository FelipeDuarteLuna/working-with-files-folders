package application;

import java.io.File;
import java.util.Scanner;

public class Caminho_do_Arquivo {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Buscando somente o arquivo e não o caminho inteiro
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println();
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
