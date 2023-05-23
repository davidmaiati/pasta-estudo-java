package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado2 {
	
	/*
	 * Elaborar um programa que calcule o reajuste de salário de um funcionário, sob as seguintes
condições: Reajuste de 15% se salário menor que R$ 500,00. Reajuste de 10% se salário entre R$
500,00 e R$ 1000,00. Reajuste de 5% se salário acima de R$ 1000,00.
	 */

	public static void main(String[] args) {
		
		double salario, aumento, salFinal, porcento;
		
		salario = Teclado.lerDouble("Informe seu salário: ");
		
		if (salario < 500) { 
			System.out.println("Salário menor que R$ 500,00");	
			porcento = 15;
		} else {
			if (salario <= 1000) {
				System.out.println("Salário estar entre R$ 500,00 e 1000,00");
				porcento = 10;	
			} else {
				System.out.println("Salário acima de R$ 1000,00");
				porcento = 5;
			}
			
		}
		
		aumento = salario * porcento / 100;
		salFinal = salario + aumento;
		System.out.println("Salário Final: R$ " + salFinal);
		
	}

}
