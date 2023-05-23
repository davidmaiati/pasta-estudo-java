package controller;

public class Questao05 {
	
	/*
	 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10.
	 */

	public static void main(String[] args) {
		
		for ( int cont = 0; cont <= 10; cont++ ) {
			System.out.println("2 elevador à " + cont + " = " + (Math.pow(2, cont)));
			
		}

		
	}

}
