package controller;

import util.Teclado;

public class Exemplo2 {

	/*
	 Fazer um programa que vpeça ao usuário para comprar uma coxinha e um rissole na cantina.
	 Informar se ele atendeu corretamente o pedido. */
	
	
	//OBS: O "else" é uma negativa do if 
	// ^ = um ou outro, não pode ser os dois 
	
	
	public static void main(String[] args) {
		
		String coxinha, rissole; 
		
		coxinha = Teclado.lerTexto("Trouxe cozinha? (s ou n)");
		rissole = Teclado.lerTexto("Trouxe rissole? (s ou n)");
		
		if (coxinha.equals("s") ^ rissole .equals("s") ) {
			System.out.println("OBAAA!Tem salgadinho!"); 
		} else {
			System.out.println("Putz,vou ficar com fome!"); 
		}
		
	System.out.println();
	
	
	}

}
