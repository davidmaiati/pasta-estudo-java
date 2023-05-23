package controller;

import util.Teclado;

public class Questao06 {
	
	/*
	 * Desenvolver um programa que crie uma matriz com 3 linhas e 5 colunas. As 4 primeiras colunas de todas
	 * as linhas deverão ser preenchidas com números informados pelo usuário. A 5ª coluna deverá receber a média
	 * dos 4 valores existentes na mesma linha (das 4 primeiras colunas). Ao final exiba toda a matriz.
	 */

	public static void main(String[] args) {
			
				
		int mat[][] = new int [3][5];
		int media = 0;
		int lin, col;
		
		for ( lin = 0; lin < 3; lin++) { 
			for ( col = 0; col < 4; col++) {
				mat[lin][col] = Teclado.lerInt("Informe o valor da mat[" + lin + "]" + "[" + col + "]");	
				
			}
			media = mat[lin][0] + mat[lin][1] + mat[lin][2] + mat[lin][3];
			mat[lin][4] = media;			
	  }
		for ( lin = 0; lin < 3; lin++) { 
			for ( col = 0; col < 4; col++) {
				System.out.println(mat[lin][col]);	
			}
	
		}
		System.out.println(media);
			
   }
		
}


