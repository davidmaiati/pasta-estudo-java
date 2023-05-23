package controller;

import util.Teclado;

public class Questao08 {
	
	/*
	 * Desenvolver um programa que pergunte 20 vezes o nome inteiro
	 * de uma pessoa, sexo e idade, e exiba o nome inteiro das pessoas que
	 * são do sexo masculino e possuem 21 anos ou mais.
	 */

	public static void main(String[] args) {
		
		int idade;
		String nome, sexo;
		
		for ( int cont = 1; cont <= 20 ; cont ++) {
			nome = Teclado.lerTexto("Informe seu nome completo:");
			sexo = Teclado.lerTexto("Informe seu sexo: (m ou f)");
			idade = Teclado.lerInt("Informe sua idade:");
			
			if ( (sexo.equals("m")) && (idade >= 21)  ) {
				System.out.println("***** NOME COMPLETO: " + nome + " *****");
			} 
		}
		
	}

}
