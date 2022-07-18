package com.helder.learning2.basico.aula2;

public class Variaveis {

	public static void main(String[] args) {

		int idade = 10;
		String nome = "Helder";
		String[] nomesCalopsitas = new String[4];
		
		nomesCalopsitas[0] = "Josué";
		nomesCalopsitas[1] = "Amarelão";
		nomesCalopsitas[2] = "Chico";
		nomesCalopsitas[3] = "Juca";
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println();
		
		for(int i = 0; i < nomesCalopsitas.length; i++) {
			System.out.println(nomesCalopsitas[i]);
		}
		
	}

}
