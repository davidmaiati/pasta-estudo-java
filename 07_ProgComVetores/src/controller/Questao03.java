package controller;

import util.Teclado;

public class Questao03 {
	
	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. 
	 * No final, apresente a soma de todos os elementos que sejam ímpares.
	 */

	public static void main(String[] args) {
		
		int a [] = new int [5];
		int acum = 0;
		
		for(int cont = 0; cont < 5; cont++) {
			
			a[cont] = Teclado.lerInt("Informe um número: " + (cont + 1) + "/5" );
			if (a[cont] % 2 == 1) {
				acum = acum + a[cont];
			}
			
		}
		
		System.out.println("--- SOMA DOS NÚMEROS ÍMPARES INFORMADOS ---");
			System.out.println(acum);
		
		
	}

}
