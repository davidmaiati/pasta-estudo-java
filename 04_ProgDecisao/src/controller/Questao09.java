package controller;

import util.Teclado;

public class Questao09 {
	
	/*
	 * Desenvolver um programa que pergunte um número e exiba
	 * a informação de que ele é positivo, negativo ou nulo.
	 */

	public static void main(String[] args) {
		
		int num;
		
		num = Teclado.lerInt("Digite um número para saber se é Positivo, Nulo ou Negativo: ");
		
		if (num > 5) {
			System.out.println("Positivo");
		} else {
			if (num < 5) { 
				System.out.println("Negativo");
			} else {
				System.out.println("Nulo");
			}
		}


	}

}
