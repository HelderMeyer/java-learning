package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc011 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int n2 = scan.nextInt();
		
		System.out.println("Digite um número real: ");
		double n3 = scan.nextDouble();
		
		double calcA = Math.pow((2*n1)+(n2/2), 2);
		double calcB = (3*n1) + n3;
		double calcC = Math.pow(n3, 3);
		
		System.out.println("a: " + calcA);
		System.out.println("b: " + calcB);
		System.out.println("c: " + calcC);
		
		scan.close();
		
	}

}
