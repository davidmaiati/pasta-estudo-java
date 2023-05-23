package controller;

public class Questao09 {
	
	/*
	 * Desenvolver um programa que apresente a série de Fibonacci até o décimo 
	 * quinto termo. A série de Fibonacci é formada
	 * pela sequência 1,1,2,3,5,8,13,21,34, ... etc. Essa série se caracteriza pela soma de um termo
	 * posterior com o seu anterior subsequente.
	 */

	public static void main(String[] args) {
		
		int ant = 1, pos = 1, aux, cont = 1;
		
		do {
			System.out.print(ant + " ");
			
			aux = ant + pos;
			ant = pos;
			pos = aux;
			
			cont++;
		} while ( cont <= 15);

	}

}
