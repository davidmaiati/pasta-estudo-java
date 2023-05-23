package controller;

import util.Teclado;

public class ExemploString {

	public static void main(String[] args) {
		
		String estado;
		estado = Teclado.lerTexto("Informe a sigla de um estado Brasileiro:");
		
		//estado = estado.toLowerCase(); ferramenta para converter qualquer digitação em letra minuscula.
		switch ( estado ) {
		case "RJ":
		case "rj":
		case "Rj":
			System.out.println("Rio de Janeiro");
			break;
			
			default:
				System.out.println("Não é Rio de Janeiro");
				break;
		}

	}

}
