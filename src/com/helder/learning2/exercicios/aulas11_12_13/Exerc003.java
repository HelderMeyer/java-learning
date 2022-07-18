package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		
		int num1 = scan.nextInt();
		
		System.out.println("O primeiro número é o " + num1);
		
		System.out.println();
		
		System.out.print("Digite o segundo número: ");
		
		int num2 = scan.nextInt();
		
		System.out.println("O segundo número é o " + num2);
		
		System.out.println();
		
		int soma = num1 + num2;
		
		System.out.println("A soma do primeiro número com o segundo número é igual a " + soma);
		
		scan.close();
	}

}
