package controller;

import util.Teclado;

public class Questao06 {
	
	/*
	 * Desenvolver um programa que apresente o valor de uma potência de uma 
	 * base qualquer elevada a um expoente qualquer, ou seja, de be , onde os valores de b e e
	 * são fornecidos pelo usuário, sem utilizar Math.pow().
	 */

	public static void main(String[] args) {
		
		int b, e, pot = 1;
		b = Teclado.lerInt("Informe a base da potência");
		e = Teclado.lerInt("Informe o expoente da potência");
		
		
		for (int cont = 1; cont <= e; cont++) {
			
			pot = pot * b;
			
		}
		System.out.println(b + " elevado à " + e + " = " + pot );
	}

}
