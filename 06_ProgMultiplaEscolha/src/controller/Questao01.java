package controller;

import util.Teclado;

public class Questao01 {
	
	/*
	 * Desenvolver um programa que mostre o menu de opções da tabela  
	 * e peça o código desejado. Mostre como resposta uma mensagem confirmando 
	 * a escolha do usuário, ou que o número digitado não existe no menu de opções.
	 * Código Opção
		1	 Incluir
		2	 Alterar
		3	 Excluir
		4 	Pesquisar
		5	 Sair
	 */

	public static void main(String[] args) {
		
		int opc;
		
		System.out.println("Precione \n" + "1 Incluir \n" + "2 Alterar"
				+ " \n" + "3 Exluir \n" + "4 Pesquisar \n" + "5 Sair \n");
		
		opc = Teclado.lerInt("Escolha uma opção:");
		
		switch (opc) {
		case 1:
			System.out.println("Você escolheu a opção Incluir");
			break;
		case 2:
			System.out.println("Você escolheu a opção Alterar");
			break;
		case 3:
			System.out.println("Você escolheu a opção Excluir");
			break;
		case 4:
			System.out.println("Você escolheu a opção Pesquisar");
			break;
		case 5:
			System.out.println("Você escolheu a opção Sair");
			break;
		default:
			System.out.println("Opção inexistente");
			break;
		}

	}

}
