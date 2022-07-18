package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora: ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("N�mero de horas trabalhadas por m�s: ");
		double horasTrabalho = scan.nextDouble();
		
		double salarioBruto = ganhoHora * horasTrabalho;
		double receitaFederal = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - inss - sindicato - receitaFederal;
		
		System.out.println("Sal�rio Bruto: +R$" + salarioBruto);
		System.out.println("Receita Federal: -R$" + receitaFederal);
		System.out.println("INSS: -R$" + inss);
		System.out.println("Sindicato: -R$" + sindicato);
		System.out.println("Sal�rio L�quido: R$" + salarioLiquido);
		System.out.println("R$" + salarioBruto + " - R$" + receitaFederal + " - R$" + inss + " - R$" + sindicato + " = R$" + salarioLiquido);
		
		scan.close();

	}

}
