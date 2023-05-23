package controller;

import util.Teclado;

public class Questao02 {
	
	/*
	 * Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz, 
	 * e ao final exiba a matriz inteira e também a soma dos números desta matriz.
	 */

	public static void main(String[] args) {
		
		int mat[][] = new int [3][2];
		int acum = 0;
		
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 2; col++) {
				
			mat[lin][col] = Teclado.lerInt("Informe um número da mat[" + lin + "]" + "[" + col + "]");
			acum = acum + mat[lin][col];
				
				
			}
		}
		
		for (int lin = 0; lin < 3; lin++) {
			for (int col = 0; col < 2; col++) {
			 System.out.println(mat[lin][col] + " ");
			}

		}
		 System.out.println("Soma das matrizes " + acum);


	}

}
