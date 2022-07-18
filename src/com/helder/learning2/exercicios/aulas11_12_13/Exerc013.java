package com.helder.learning2.exercicios.aulas11_12_13;

import java.util.Scanner;

public class Exerc013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora: ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Número de horas trabalhadas por mês: ");
		double horasTrabalho = scan.nextDouble();
		
		double salarioBruto = ganhoHora * horasTrabalho;
		double receitaFederal = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - inss - sindicato - receitaFederal;
		
		System.out.println("Salário Bruto: +R$" + salarioBruto);
		System.out.println("Receita Federal: -R$" + receitaFederal);
		System.out.println("INSS: -R$" + inss);
		System.out.println("Sindicato: -R$" + sindicato);
		System.out.println("Salário Líquido: R$" + salarioLiquido);
		System.out.println("R$" + salarioBruto + " - R$" + receitaFederal + " - R$" + inss + " - R$" + sindicato + " = R$" + salarioLiquido);
		
		scan.close();

	}

}
