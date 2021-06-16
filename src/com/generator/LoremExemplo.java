package com.generator;

import com.generator.lorem.LoremIpsumGenerator;

public class LoremExemplo {

	public static void main(String[] args) {
		int tamanho = 10;
		
		LoremIpsumGenerator loremIpsumGenerator = new LoremIpsumGenerator();
		
		String lorem = loremIpsumGenerator.generate(tamanho);
		System.out.println(lorem);

	}

}
