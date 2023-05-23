package controller;

import util.Teclado;

public class Ex05 {
public static void main(String[] args) {
	double salario, salarioFinal;
	
	salario = Teclado.lerDouble("Digite seu salário atual: ");
	
	salarioFinal = salario * 1.15;
	
	System.out.println("Seu salário com acréscimo é: " + salarioFinal);
	
}
}
