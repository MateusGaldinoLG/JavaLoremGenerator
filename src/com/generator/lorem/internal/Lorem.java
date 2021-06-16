package com.generator.lorem.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lorem {
	
	private static String[] getLorem() {
		File arquivo = new File("../LoremGenerator/src/com/generator/lorem/internal/lorem.txt");
		
		String[] ipsum;
		try {
			Scanner s = new Scanner(arquivo);
			ipsum = s.nextLine().split(" ");
			return ipsum;
		} catch (FileNotFoundException e) {
			System.out.println("Um erro ocorreu no sistema ao tentar encontrar o arquivo de Lorem, tente novamente mais tarde");
			return null;
		}
	}
	
	public String[] generateLorem() {
		return getLorem();
	}
}
