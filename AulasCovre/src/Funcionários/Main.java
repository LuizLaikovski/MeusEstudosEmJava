package Funcionários;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioB;
		double imposto;
		double aumento;

		System.out.println("Digite seu nome: "); nome = sc.nextLine();
		System.out.println("Salário Base: "); salarioB = sc.nextDouble();
		System.out.println("Imposto: "); imposto = sc.nextDouble();
		
		Empregado pessoa = new Empregado(nome, salarioB, imposto);
		
		System.out.printf("Empregado: %s, R$ %.2f %n", pessoa.getNome(), pessoa.salarioLiquido());
		System.out.println("Quantos porcento de aumento no salário? "); aumento = sc.nextDouble();
		pessoa.aumentaSalario(aumento);
		System.out.printf("Dados Atualizados: %s, %.2f", pessoa.getNome(), pessoa.getSalario());
		
		
		sc.close();
	}

}
