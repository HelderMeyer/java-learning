package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		
		int num1 = scan.nextInt();
		
		System.out.println("O primeiro n�mero � o " + num1);
		
		System.out.println();
		
		System.out.print("Digite o segundo n�mero: ");
		
		int num2 = scan.nextInt();
		
		System.out.println("O segundo n�mero � o " + num2);
		
		System.out.println();
		
		int soma = num1 + num2;
		
		System.out.println("A soma do primeiro n�mero com o segundo n�mero � igual a " + soma);
		
		scan.close();
	}

}
