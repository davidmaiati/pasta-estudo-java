package controller;

import util.Teclado;

public class Questao04 {
	
	/*
	 * Desenvolver um programa que crie uma matriz de 5 linhas e 2 colunas. 
	 * Pergunte ao usuário números para preencher toda a matriz, e ao final,
	 * exiba a matriz inteira e a média dos números da matriz.
	 */

	public static void main(String[] args) {
		
		double mat[][] = new double [5][2];
		double acum = 0;
		
		for(int lin = 0; lin < 5; lin++) {
			for(int col = 0; col < 2; col++) {
				mat[lin][col] = Teclado.lerDouble("Informe um número para mat[" + lin + "]" + "[" + col + "]");
				acum = acum + mat[lin][col];
				}		
			}
		for(int lin = 0; lin < 5; lin++) {
			for(int col = 0; col < 2; col++) {
				
				System.out.print(mat[lin][col] + " ");
				}
			}
		System.out.println("\nMédia da matríz\n" + (acum / 10) );
	}

}
