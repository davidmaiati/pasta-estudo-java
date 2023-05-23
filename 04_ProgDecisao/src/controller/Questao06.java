package controller;

import util.Teclado;

public class Questao06 {
	
	/*
	 * Desenvolver um programa que pergunte dois valores numéricos inteiros e apresente o valor da diferença entre o
	 * maior valor e o menor valor lido.
	 */

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = Teclado.lerInt("Informe um número:");
		num2 = Teclado.lerInt("Informe outro número:");
		
		if (num1 > num2) {
			System.out.println("A diferença é: " + (num1 - num2));
		} else {
			System.out.println("A diferença é: " + (num2 - num1));
		}

	}

}
