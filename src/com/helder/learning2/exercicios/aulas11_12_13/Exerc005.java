package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc005 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversor de metros para centímetros!");
		System.out.println();
		System.out.print("Digite um valor em metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println(metros + " metros são " + centimetros + " centímetros.");
		
		scan.close();
		
	}

}
