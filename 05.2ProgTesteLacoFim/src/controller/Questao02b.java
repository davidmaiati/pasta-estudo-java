package controller;

public class Questao02b {
	
	/*
	 * Desenvolver um programa que apresente no final a soma dos valores
	 *  pares existentes na faixa de 0 até 500. Utilize um laço que varie de 1 em 1.
	 */

	public static void main(String[] args) {
		
		int cont = 0, acum = 0;
		
		do {
		   if (cont % 2 == 0) {
			   acum = acum + cont;
		   }
			cont++;
		} while ( cont <= 500);
		
		System.out.println("As soma dos valores pares de zero a 500 é: " + acum);
	}

}