package controller;

import util.Teclado;

public class Questao02 {
	/*
	 * Desenvolver um programa que apresente o total
	 * da soma de n números inteiros do número 1 até n, onde n é um valor
	 * informado pelo usuário.
	 */

	public static void main(String[] args) {
		
		int n, acum = 0;
		n = Teclado.lerInt("Informe um número:");
		
		for ( int cont = 1 ; cont <= n; cont ++) {
			
			acum = acum + cont;
		}
		System.out.println("A soma dos valores de 1 até " + n + " é igual a = " + acum);
	} 

}