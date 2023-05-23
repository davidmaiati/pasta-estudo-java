package controller;

import util.Teclado;

public class Questao05 {
	
	/*
	 * Desenvolver um programa que pergunte 5 valores do vetor a, e em seguida crie um vetor b de mesma dimensão
	 * contendo os valores ao quadrado correspondentes no vetor a. Ao final exibir os 2 vetores.
	 */

	public static void main(String[] args) {
		
		double a[] = new double[5];
		double b[] = new double[5];
		
		for(int cont = 0 ; cont < 5; cont++) {	
			a[cont] = Teclado.lerDouble("Informe um número: ");
			b[cont] = Math.pow(a[cont], 2);
		}
		for(int cont = 0 ; cont < 5; cont++) {
			System.out.print(a[cont] + " " );
		}
		System.out.println("");
		for(int cont = 0 ; cont < 5; cont++) {
			System.out.print(b[cont] + " ");
		}
		
	}

}
