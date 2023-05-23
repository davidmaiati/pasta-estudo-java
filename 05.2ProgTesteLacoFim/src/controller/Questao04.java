package controller;

import util.Teclado;

public class Questao04 {
	
	/*
	 * Desenvolver um programa que apresente os resultados de uma
	 * tabuada de um número n qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x 9, n x 10)
	 */

	public static void main(String[] args) {
		
		int n, multiplicador = 1, resultado;
		n = Teclado.lerInt("Informe um número e saiba a tabuada");

		do { 
			resultado = n * multiplicador;
			System.out.println(n + " x " + multiplicador + " = " + resultado);
			multiplicador++;
		} while (multiplicador <= 10);
	
	}

}
