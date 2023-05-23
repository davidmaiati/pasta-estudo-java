package controller;

import util.Teclado;

public class ExemploMultiplaEscolha {
	
	/*
	 * Programa que pergunte o número de matricula de sócio de um clube e exiba
	 * o mês de pagamento concluído da anuidade, conforme a seguinte tabela.
	 * N° de matrícula	0	- Janeiro
	 * 					1	- Fevereiro
	 * 					2	- Março
	 * 					3	- Abril
	 * 			Outro Final	- Maio
	 */

	public static void main(String[] args) {
		
		int matricula, ultimo;
		matricula = Teclado.lerInt("Informe o número de sua matrícula");
		  
		ultimo = matricula % 10;
		
		switch ( ultimo ) {	
		case 0:
			System.out.println("Mês de pagamento: janeiro");
			break;
		case 1:
			System.out.println("Mês de pagamento: Fevereiro");
			break;
		case 2:
			System.out.println("Mês de pagamento: Março");
			break;
		case 3:
			System.out.println("Mês de pagamento: Abril");
			break;
		default: 
			System.out.println("Mês de pagamento: Maio");
			break;
			
		}//Fim do switch
		//switch roda com String ou int, double não rodaS
		

	}

}
