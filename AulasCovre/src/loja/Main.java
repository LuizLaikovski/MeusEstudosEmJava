package loja;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Loja produto = new Loja();
		
		System.out.println("Informe os dados do produto: ");
		System.out.println("Nome: ");
		produto.nome = sc.next();
		System.out.println("Preço: R$");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade no estoque: ");
		produto.addProdutos(sc.nextInt());
		System.out.println("Dados do produto: "+ produto);
		System.out.println("Informe a qunatidade de protudos que serão add ao estoque: ");
		produto.addProdutos(sc.nextInt());
		System.out.println("Dados do produto: "+ produto);
		System.out.println("Informe a quantidade de produtos que são removidos do estoque: ");
		produto.removeProdutos(sc.nextInt());
		System.out.println("Dados do produto: "+ produto);
		
		
		sc.close();
	}

}
