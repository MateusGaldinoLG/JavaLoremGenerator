package com.generator.lorem;

import com.generator.lorem.internal.Lorem;

public class LoremIpsumGenerator {
	private String loremGenerated = "";
	
	/**
	  * Generates Lorem Ipsum
	  * @param numPalavras - Number of words to be requested to the generator
	  * @return - Lorem String generated
	  */
	public String generate(int numPalavras) {
		Lorem lorem = new Lorem();
		String[] loremIpsum = lorem.generateLorem();
		for (int i = 0; i < numPalavras; i++) {
			this.loremGenerated = this.loremGenerated.concat(loremIpsum[i] + " ");
		}
		return this.loremGenerated;
	}
	
	/**
	  * Generates Lorem Ipsum
	  * @param numPalavras - Number of words to be requested to the generator
	  * @param numParagraph - Number of paragraphs you want the lorem ipsum to be divided into.
	  * @return - Lorem String generated
	  */
	public String generate(int numPalavras, int numParagraph) {
		Lorem lorem = new Lorem();
		String[] loremIpsum = lorem.generateLorem();
		int wordsParagraph = numPalavras/ numParagraph;
		System.out.println(wordsParagraph);
		for (int i = 0; i < numPalavras; i++) {
			if(i % wordsParagraph == 0 && i > 0) {
				this.loremGenerated = this.loremGenerated.concat(loremIpsum[i] + ".\n");
			}
			else {
				this.loremGenerated = this.loremGenerated.concat(loremIpsum[i] + " ");
			}
		}
		return this.loremGenerated;
	}
	
	/**
	  * Generates Lorem Ipsum
	  * @param numPalavras - Number of words to be requested to the generator
	  * @param palavrasParagraph - number of words in each paragraph
	  * @return - Lorem String generated
	  */
	public String generateParagraphs(int numPalavras, int palavrasParagraph) {
		Lorem lorem = new Lorem();
		String[] loremIpsum = lorem.generateLorem();
		for (int i = 0; i < numPalavras; i++) {
			if(i % (palavrasParagraph + 1) == 0 && i > 0) {
				this.loremGenerated = this.loremGenerated.concat("\n" + loremIpsum[i]);
			}
			else {
				this.loremGenerated = this.loremGenerated.concat(loremIpsum[i] + " ");
			}
		}
		return this.loremGenerated;
	}
	
	
}
