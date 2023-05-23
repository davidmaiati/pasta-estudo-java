package controller;

import util.Teclado;

public class Questao03 {
	
	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada 
	 * de um número qualquer informado pelo usuário.
	 */

	public static void main(String[] args) {
		
		int n;
		n = Teclado.lerInt("Informe um número");
		
		for ( int cont = 1;cont <= 10; cont++ ) {
			System.out.println(n + " x " + cont + " = " + ( n * cont));
		}

	}

}
