package controller;

import util.Teclado;

public class Questao08 {
	
	/*
	 * Desenvolver um programa que apresente o valor de uma 
	 * potência de uma base qualquer elevada a um expoente 
	 * qualquer, ou seja, de be. (Não utilize Math.pow();)
	 */

	public static void main(String[] args) {
		
		int b, e, cont = 1, potencia = 1;
		
		b = Teclado.lerInt("Informe a base da potência: ");
		e = Teclado.lerInt("Informe o expoente da potência: ");
		
		do {
			potencia = potencia * b;
			cont++;
		} while(cont == e);
		System.out.println(b + " elevado à " + e + " = " + potencia);
	}

}
