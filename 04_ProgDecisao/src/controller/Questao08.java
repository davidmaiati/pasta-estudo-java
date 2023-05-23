package controller;

import util.Teclado;

public class Questao08 {
	
	/*
	 * Desenvolver um programa que pergunte um número 
	 * inteiro qualquer e verifique se ele está na faixa de 1 a 10.
	 */

	public static void main(String[] args) {
		
		int num;
		
		num = Teclado.lerInt("Digite um número: ");
		
		if ( (num > 0) && (num <= 10) ) {
			System.out.println("Número estar entre 1 e 10");
		} else {
			System.out.println("Número não estar entre 1 e 10");
		}

	}

}
