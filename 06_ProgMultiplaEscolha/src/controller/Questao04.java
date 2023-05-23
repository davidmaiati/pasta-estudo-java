package controller;

import util.Teclado;

public class Questao04 {
	
	/*
	 * Desenvolver um programa que pergunte a sigla do estado onde a pessoa reside, e
	 * apresente uma das seguintes alternativas como resposta: Carioca, Paulista, Mineiro, Outros Estados.
	 */

	public static void main(String[] args) {
		
		String estado;
		
		estado = Teclado.lerTexto("Informe a sigla de sua cidade natal:");
		estado = estado.toLowerCase();
		
		switch (estado) {
		
		case "rj":
			System.out.println("Você é carioca");
			break;
		case "mg":
			System.out.println("Você é mineiro");
			break;
		case "sp":
			System.out.println("Você é paulista");
			break;
		default:
			System.out.println("Ainda não temos informação sobre essa sigla");
			break;
			
		}

	}

}
