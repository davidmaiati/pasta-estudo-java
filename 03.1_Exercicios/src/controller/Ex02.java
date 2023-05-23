package controller;

import util.Teclado;

public class Ex02 {
public static void main(String[] args) {
	int n1, n2, n3, n4, adicao, multiplicacao;

	
	
	n1 = Teclado.lerInt("Digite o 1º numero: ");
	n2 = Teclado.lerInt("Digite o 2º numero: ");
	n3 = Teclado.lerInt("Digite o 3º numero: ");
	n4 = Teclado.lerInt("Digite o 4º numero: ");

	adicao = n1 + n2 + n3 + n4;
	multiplicacao = n1 * n2 * n3 * n4;
	
	System.out.println("Resultado da adição: " + adicao);
	System.out.println("Resultado da multiplicação:" + multiplicacao);
}
}
