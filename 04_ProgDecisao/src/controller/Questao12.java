package controller;

import util.Teclado;

public class Questao12 {
	
	/*
	 * Desenvolver um programa que pergunte 5 números inteiros e identifique o maior número e o menor número.
	 */

	public static void main(String[] args) {
		
		int n1, n2, n3, n4, n5, menor, maior;
		
		n1 = Teclado.lerInt("Informe o valor 1:");
		n2 = Teclado.lerInt("Informe o valor 2:");
		n3 = Teclado.lerInt("Informe o valor 3:");
		n4 = Teclado.lerInt("Informe o valor 4:");
		n5 = Teclado.lerInt("Informe o valor 5:");
		
		maior = n1;

		
		if ( n2 > maior) {
			maior = n2;
		}
		if (n3 > maior) {
			maior = n3;
		} 
		if (n4 > maior) {
			maior = n4;
		} 
		if (n5 > maior) {
			maior = n5;
		}
		
		System.out.println("O maior valor inserido foi: " + maior);
		menor = n1;
		
		
		if ( n2 < menor) {
			menor = n2;
		}
		if (n3 < menor) {
			menor = n3;
		} 
		if (n4 < menor ) {
			menor = n4;
		} 
		if (n5 < maior) {
			menor = n5;
		}
		
		System.out.println("O menor valor inserido foi: " + menor);
	}
		

	}


