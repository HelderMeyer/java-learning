package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc006 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual � o raio do c�rculo, em cent�metros: ");
		
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A �rea do c�rculo � de " + area + " cent�metros.");
		
		scan.close();
		
	}

}
