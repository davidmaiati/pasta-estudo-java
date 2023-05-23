package controller;

import util.Teclado;

public class Ex04 {
public static void main(String[] args) {
	
	int n, antecessor, sucessor;
	
	n = Teclado.lerInt("Digite um número: ");
	
	antecessor = n - 1;
	sucessor = n + 1;
	
	System.out.println("Antecessor é " + antecessor);
	System.out.println("Sucessor é " + sucessor);
	
}
}
