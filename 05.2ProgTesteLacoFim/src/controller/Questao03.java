package controller;

public class Questao03 {
	
	//Desenvolver um programa que apresente o total da soma dos cinco primeiros números inteiros.

	public static void main(String[] args) {
		
		int cont = 1, acum = 0;
		
		do {
			acum = acum + cont;
			cont ++;
		} while ( cont <= 5);
		
		System.out.println("A soma dos cinco primeiros números é " + acum); 		
	}

}