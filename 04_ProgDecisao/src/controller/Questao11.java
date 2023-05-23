package controller;

import util.Teclado;

public class Questao11 {
	
	/*
	 * Desenvolver um programa que pergunte um número 
	 * de 3 casas e apresente como resultado somente 
	 * o algarismo das centenas.
	 */

	public static void main(String[] args) {
		
		int num1;
		
		num1 = Teclado.lerInt("Apresente um número de 3 dígitos: ");
		
		if((num1 > 99) && (num1 <= 999)){
			System.out.println(num1);
		}else System.out.println("ERRO");	
	}

}
