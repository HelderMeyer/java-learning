package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu n�mero, por favor: ");
		
		int numero = scan.nextInt();
		
		System.out.println("O n�mero informado foi " + numero);
		
		scan.close();
	}

}
