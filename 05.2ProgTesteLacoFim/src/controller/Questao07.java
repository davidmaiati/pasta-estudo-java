package controller;

public class Questao07 {
	
	/*
	 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10.
	 */

	public static void main(String[] args) {
		
		int cont = 0;
		
		do {
			System.out.println("2 elevado a " + cont + " = " + (Math.pow(2, cont))) ;
			cont++;
		} while (cont <= 10);
		

	}

}
