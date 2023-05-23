package controller;

import util.Teclado;

public class Questao01 {
	
	/*
	 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte  ao usuário o nome e
	 * a profissão de 5 pessoas e preencha estes vetores. Ao final exiba um relatório apontando o nome e 
	 * a profissão de cada uma das 5 pessoas cadastradas.
	 */

	public static void main(String[] args) {
		
		String nome[] = new String[5];
		String prof[] = new String[5];
		
		for (int cont = 0; cont < 5; cont ++) {
			nome[cont] = Teclado.lerTexto("informe o nome do trabalhador: " + (cont + 1));
			prof[cont] = Teclado.lerTexto("Informe a profissão " + (cont + 1));
			
		}
		
		System.out.println("--- RELAÇÃO DE NOME E PROFISSÃO ---");
		for (int cont = 0; cont < 5; cont ++) {
			System.out.println("Nome: " + nome[cont] + " - " + " Profissão: " + prof[cont]);
		}
	}

}
