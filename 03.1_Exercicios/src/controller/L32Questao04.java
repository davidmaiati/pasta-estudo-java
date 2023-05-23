package controller;

import util.Teclado;

public class L32Questao04 {
	
	/*
	 * Desenvolver um programa que pergunte ao usuário o seu peso e sua altura. Ao final o programa deverá exibir na
	 * tela o valor do índice de massa corporal desta pessoa (IMC).
	 * Fórmula: IMC = peso / altura2
	 * - Obs: peso em quilos e altura em metros.
	 */

	public static void main(String[] args) {
		
		double imc, peso, altura;
		
		peso = Teclado.lerDouble("Informe seu peso em quilos:");
		altura = Teclado.lerDouble("Informe sua altura em metros:");
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.println("Indíce de massa muscular: " + imc);

	}

}
