package controller;

public class Questao07 {
	
	/*
	 * Desenvolva um programa que gere e exiba a matriz abaixo:
			11 12 13 14
			15 16 17 18
			19 20 21 22
	 */

	public static void main(String[] args) {
		
		int mat[][] = new int [3][4];
		int cont = 11;
		
		for (int lin = 0; lin < 3; lin++) {
			for(int col = 0; col < 4; col++) {
				mat[lin][col] = cont;
				cont++;
				System.out.print(mat[lin][col] + " ");
				
			}
			System.out.println(" ");
		}
			
	}

}
