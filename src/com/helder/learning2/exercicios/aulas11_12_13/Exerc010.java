package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc010 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual é a temperatura em graus Celsius: ");
		double temperaturaCelsius = scan.nextDouble();

		double temperaturaFarenheit = ((temperaturaCelsius * 1.8) + 32);
				//(0 °C × 9/5) + 32 = 32 °F

		System.out.println("A temperatura em Farenheit é de " + temperaturaFarenheit + " Fº");

		scan.close();

	}

}
