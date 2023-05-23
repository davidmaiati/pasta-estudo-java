package controller;

import util.Teclado;

public class L32Questao08 {
	
	/*
	 * Fazer um algoritmo que receba o preço de custo de um produto e mostre como resposta o valor de venda. Sabe-
	 * se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
	 */

	public static void main(String[] args) {
		
		double precoCusto, percentualAcrescimo, valorVenda;
		
		precoCusto = Teclado.lerDouble("Informe o preço de custo do produto:");
		percentualAcrescimo = Teclado.lerDouble("Informe o percentual de acréscimo:");
		
		valorVenda = precoCusto + (precoCusto * percentualAcrescimo / 100);
		
		System.out.println(valorVenda);

	}

}
