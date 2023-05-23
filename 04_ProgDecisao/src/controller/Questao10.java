package controller;

import util.Teclado;

public class Questao10 {
	
	/*
	 * Desenvolver um programa que pergunte dois números inteiros, 
	 * e apresente como resultado se o segundo número informado 
	 * é ou não um divisor do primeiro número informado.
	 */

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = Teclado.lerInt("Informe um número: " );
		num2 = Teclado.lerInt("Informe outro número: ");
	

		
		if (num1 % num2 == 0  ) {
			System.out.println( num2 + " é divisor de " + num1);
		} else {
			System.out.println( num2 + " não é divisor de " + num1);
		}

	}

}
