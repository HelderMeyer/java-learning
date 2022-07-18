package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é a sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = ((72.7*altura)-58);
		System.out.println("Seu peso ideal é de " + pesoIdeal + " kg.");
		
		scan.close();
		
	}

}
