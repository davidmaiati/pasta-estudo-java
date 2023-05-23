package controller;

import util.Teclado;

public class Questao05 {
	
	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 4 colunas. Pergunte ao usuário nomes de pessoas
para preencher toda a matriz. Em seguida o programa perguntará ao usuário as coordenadas (linha e coluna)
que deseja visualizar o conteúdo correspondente na matriz. Enquanto o usuário informar coordenadas válidas, o
programa exibirá o conteúdo correspondente. No momento em que forem inseridas coordenadas não válidas o
programa será encerrado com a mensagem na tela “Coordenadas inválidas”.
	 */

	public static void main(String[] args) {
		
		String mat[][] = new String[4][4];
		int lin, col;
		boolean valido = true;
		
		for (lin = 0; lin < 4; lin++) {
			for(col = 0; col < 4; col++) {
		mat[lin][col] = Teclado.lerTexto("Informe um nome de uma pessoa para mat[" + lin + "]" + "[" + col + "]");
			}
		}
			System.out.println("--- COORDENADAS DA MATRIZ ---");
			
			do {
				lin = Teclado.lerInt("Informe a linha (0 a 3):");
				col = Teclado.lerInt("Informe a coluna (0 a 3):");
				
				if ((lin >= 4) || (col >=4) ) {
					System.out.println("COORDENADAS INVÁLIDAS");
					valido = false;
				} else {
					System.err.println("Valor da mat: a[" + lin + "]" + "[" + col + "]");
				}

			}while (valido);
				
	}

}
