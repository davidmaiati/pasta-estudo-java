package controller;

public class Questao05 {
	
	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 20.
	 */

	public static void main(String[] args) {
		
		int cont = 1;
		
		do {
			if ( cont % 4 == 0) {
				System.out.println(cont);
			}
			
			cont++;
		} while ( cont < 20);
		
		
	}

}
