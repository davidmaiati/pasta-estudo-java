package controller;

import util.Teclado;

public class Questao03 {
	
	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas. Pergunte ao usuário números para
	 * preencher toda a matriz, e ao final, exiba a matriz inteira e a soma dos números pares contidos na matriz.
	 */

	public static void main(String[] args) {
		
		int mat[][] = new int [4][3];
		int somaPar = 0;
		int acum = 0;
		
		for ( int lin = 0; lin < 4; lin++) {
			for (int  col = 0; col < 3; col++) {
				mat[lin][col] = Teclado.lerInt("Informe número da mat[" + lin + "]" + "[" + col + "]");
				
				if (mat[lin][col] % 2 == 0)	somaPar = somaPar + mat[lin][col];
					
			}
			
		}
		System.out.println("\n--- Matriz dos valores apresentados ---\n" );
		for ( int lin = 0; lin < 4; lin++) {
			for (int  col = 0; col < 3; col++) {
				acum = mat[lin][col];
				
				System.out.print(acum + " ");
			}
			System.out.println(" ");
		
		}
			System.out.println("\nSoma dos valores pares apresentados: " + somaPar);
	}
}