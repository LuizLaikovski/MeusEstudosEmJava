package PrimeiroArray;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos deseja declarar: ");
		int quantidade = sc.nextInt();
		
		Produtos[] produto = new Produtos[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Dados do "+(i+1)+"º Produto: ");
			System.out.print("Nome: ");
			String nomeString = sc.next();
			System.out.print("Preço: R$");
			double preco = sc.nextDouble();
			
			produto[i] = new Produtos(nomeString, preco);
		}
		
		double soma = 0.0;
		for (int i = 0; i < quantidade; i++) {
			soma += produto[i].getPreco();
		}
		
		double media = soma / quantidade;
		System.out.printf("Preço médio: R$ %.2f", media);
		sc.close();
	}

}