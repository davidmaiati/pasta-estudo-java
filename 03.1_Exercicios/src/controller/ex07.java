package controller;

import util.Teclado;

public class ex07 {
	public static void main(String[]args) {
		
		int n;
		n = Teclado.lerInt("informe um numero ");
		for (int cont = 0 ; cont <= 10 ; cont++) {
			System.out.println(n + " x " + cont + " = " + (n*cont));
		}
	}

}
