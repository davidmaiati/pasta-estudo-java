package controller;

import util.Teclado;

public class Questao01 {
	
	/*
	 * Desenvolver um programa que crie uma matriz com 5 linhas e 3 colunas.
	 * Pergunte ao usuário o conteúdo desta matriz e ao final exiba a matriz inteira.
	 */

	public static void main(String[] args) {
		
		int mat[][] = new int [5][3];
		
		for (int lin = 0; lin < 5; lin++) {
			for (int col = 0;col < 3 ; col++) {
				
				mat[lin][col] = Teclado.lerInt("Informar número para mat[" + lin + "]" + "[" + col + "]");
				
			}
		}
		
		for (int lin = 0; lin < 5; lin++) {
			for (int col = 0;col < 3 ; col++) {
				
				System.out.print(mat[lin][col] + "");
				
			}
			System.out.println("");
		}

	}

}
