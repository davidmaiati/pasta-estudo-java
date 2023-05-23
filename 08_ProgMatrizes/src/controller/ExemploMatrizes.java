package controller;

import util.Teclado;

public class ExemploMatrizes {
	
	/*
	 * Fazer uma matriz com 3 linhas e 4 colunas e preencher com valores inseridos pelo
	 * usuário. Ao final exibir todos os valores inseridos.
	 */

	public static void main(String[] args) {
		//declaração de matriz[linhas][colunas]
		
		int mat[][] = new int [3][4];
		
		for(int lin = 0; lin < 3; lin ++) {
			for (int col = 0; col < 4; col++) {
				mat[lin][col] = Teclado.lerInt("Informar número para mat[" + lin + "]" + "[" + col + "]");
				
				
			}//fim do for da coluna
		}//fim do for linha
		
		System.out.println("--- EXIBINDO TODA MATRIZ ---");
		
		for(int lin = 0; lin < 3; lin ++) {
			for (int col = 0; col < 4; col++) {
			 System.out.print(mat[lin][col] + " ");
			}
			System.out.println("");
		}

	}

}
