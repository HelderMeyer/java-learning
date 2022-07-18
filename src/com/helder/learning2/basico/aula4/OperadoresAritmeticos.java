package com.helder.learning2.basico.aula4;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int x = scan.nextInt();
		
		System.out.println("Digite outro número: ");
		
		int y = scan.nextInt();
				
		System.out.println("O resultado é " + resultado(x,y));
		
		scan.close();
		
		int resultado = 1 + 2;
		
		System.out.println(resultado);
		
		resultado = resultado * 2;
		
		System.out.println(resultado);
		
		resultado = resultado + 8;
		
		System.out.println(resultado);
		
		resultado = resultado / 2;
		
		System.out.println(resultado);
		
		resultado = resultado % 7;
		
		System.out.println(resultado);
		
		String primeiroNome = "Helder";
		String segundoNome = " Meyer";
		String juntarNomes = primeiroNome + segundoNome;
		
		System.out.println(juntarNomes);
		
		System.out.println(resultado++);
		System.out.println(++resultado);
		
	}
	
	public static int resultado(int x, int y) {
		int result = x + y;
		return result;
	}
	
}
