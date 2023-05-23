package controller;

import util.Teclado;

public class ex01 {
public static void main(String[] args) {
	String nome, sexo;
	
	nome = Teclado.lerTexto("Digite seu nome:"); 
	sexo = Teclado.lerTexto("Digite seu sexo:");
	
	System.out.println("nome: " + nome);
	System.out.println("sexo: " + sexo);
	
}
}
