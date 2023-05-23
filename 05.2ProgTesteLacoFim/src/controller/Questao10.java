package controller;

import util.Teclado;

public class Questao10 {
	
	/*
	 * A série de Ricci difere da série de Fibonacci porque os dois primeiros termos são fornecidos pelo usuário.
	 * O restante da série é calculado da mesma forma que na série de Fibonacci. Altere o programa da questão anterior,
	 * para que sejam perguntados os dois primeiros termos da série de Ricci, e sejam exibidos os 15 termos
	 * subsequentes desta série.
	 */

	public static void main(String[] args) {
		

		int ant, pos, aux, cont = 1;
		
		ant = Teclado.lerInt("Insira primeiro termo da série de Ricci");
		pos = Teclado.lerInt("Insira o segundo termo da série de Ricci");
		
		do {
			System.out.print(ant + " ");
			
			aux = ant + pos;
			ant = pos;
			pos = aux;
			
			cont++;
		} while ( cont <= 15);


	}

}
