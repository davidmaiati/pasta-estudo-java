package controller;

import util.Teclado;

public class Questao08 {
	
	/*
	 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos, calcule e armazene a média,
	 * armazene também a situação do aluno (AP ou RP). Exibir ao final uma listagem contendo nomes, notas, médias e
	 * situação de cada aluno.
	 */

	public static void main(String[] args) {
		
		String nome[] = new String [15];
		double pr1[] = new double [15];
		double pr2[] = new double [15];
		double media[] = new double [15];
		String situacao[] = new String [15];
		
		for (int cont = 0;cont < 15 ; cont++) {
			
			nome[cont] = Teclado.lerTexto("Informe o nome do aluno:");
			pr1[cont] = Teclado.lerDouble("pr1 do(a) aluno(a)" + nome[cont]);
			pr2[cont] = Teclado.lerDouble("pr2 do(a) aluno(a)" + nome[cont]);
			media[cont] = (pr1[cont] + pr2[cont]) / 2;
			
			if (media[cont] >= 7) {
				situacao[cont] = "Aprovado";
			} else {
				situacao[cont] = "Reprovado";
			}
			
		} 
		
		System.out.println(" ###  BOLETIM  ### ");
		
		for (int cont = 0;cont < 15 ; cont++) {
			
			System.out.println("Aluno: " + nome[cont]);
			System.out.println("Nota PR1: " + pr1[cont]);
			System.out.println("Nota PR2: " + pr2[cont]);
			System.out.println("Média: " + media[cont]);
			System.out.println("Situação: " + situacao[cont]);
			System.out.println("-------\n");
			
			
		}

	}

}
