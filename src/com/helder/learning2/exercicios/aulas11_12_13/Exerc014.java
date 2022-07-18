package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc014 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do arquivo para download (em MB): ");
		double arquivo = scan.nextDouble();
		
		System.out.println("Qual é a velocidade de download (em Mbps): ");
		double velocidade = scan.nextDouble();
		
		double tempo = arquivo/velocidade;
		System.out.println("O tempo é de " + tempo + " segundos.");
		
		scan.close();
		
	}

}
