package com.helder.learning2.basico.aula3;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome: ");
		
		String nome = scan.next();
		
		System.out.println("Quantos anos você tem: ");
		
		int idade = scan.nextInt();
		
		System.out.println("Qual é a sua altura (em metros): ");
		
		double altura = scan.nextDouble();
		
		System.out.println("Qual é o seu peso (em kg): ");
		
		double peso = scan.nextDouble();
		
		double imc = peso/(altura*altura);
		
		System.out.print("Seu nome é " 
		+ nome 
		+ ". Você tem " 
		+ idade + " anos e seu IMC é de " 
		+ imc
		+ ". Logo, você está ");
		
		if(imc >= 18.5 && imc < 30.0) {
			System.out.println("com peso normal!");
		}else if(imc < 18.5) {
			System.out.println("abaixo do peso!");
		}else if(imc >= 30.0) {
			System.out.println("acima do peso!");
		}
		
		scan.close();
		
	}
	
}
