package Banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Informe o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Informe o nome do titular: ");
		String titular= sc.next();
		System.out.print("Tem depósito inicial[S/N]: ");
		char op = sc.next() .toUpperCase() .charAt(0);
		
		if (op == 'S') {
			System.out.println("Informe o valor do depósito: R$ ");
			Double quantia = sc.nextDouble();
			conta = new Conta(numero, titular, quantia);
		} else {
			conta = new Conta(numero, titular);
		}
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.print("Informe o valor do depósito: ");
		conta.deposito(sc.nextDouble());
		
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println("Informe o valor do saque: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		
		sc.close();
	}

}
