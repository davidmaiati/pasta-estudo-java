package controller;

import util.Teclado;

public class Ex03 {
public static void main(String[] args) {
	double dolar, real;
	
	dolar = Teclado.lerDouble("Digite o valor em dólares: ");
	
	real = dolar * 5.42;
	
	System.out.println("O valor convertido em reais é: " + real);
}
}
