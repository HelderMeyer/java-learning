package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc008 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantos reais voc� ganha por hora trabalhada: ");
		double salarioHora = scan.nextDouble();

		System.out.println("Qual � o seu n�mero de horas trabalhando por m�s: ");
		double horasTrabalhadas = scan.nextDouble();

		double salarioMensal = salarioHora * horasTrabalhadas;

		System.out.println("Seu sal�rio desse m�s foi de " + salarioMensal + " reais.");

		scan.close();

	}

}
