package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc004 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota1: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota2: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite a nota3: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a nota4: ");
		double nota4 = scan.nextDouble();
		
		double media = ((nota1 + nota2 + nota3 + nota4)/4);
		
		System.out.println("A média das 4 notas é de " + media);
		
		scan.close();
		
		
	}
	
}
