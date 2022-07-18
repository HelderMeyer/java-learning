package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura em graus Farenheit: ");
		double temperaturaFarenheit = scan.nextDouble();
		
		double temperaturasCelsius = ((5 * (temperaturaFarenheit-32))/9);
		
		System.out.println("A temperatura em Celsius é de " + temperaturasCelsius + " Cº");
		
		scan.close();
		
	}

}
