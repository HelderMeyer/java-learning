package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o comprimento do quadrado, em cent�metros: ");

		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		double area2x = area * 2;
		
		System.out.println("O dobro da �rea do quadrado � " + area2x + " cent�metros.");
		
		scan.close();

	}

}
