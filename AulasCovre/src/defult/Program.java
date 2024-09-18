package defult;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		System.out.print("1º nota: ");
		double n1 = sc.nextDouble();
		System.out.print("2º nota: ");
		double n2 = sc.nextDouble();
		System.out.print("3º nota: ");
		double n3 = sc.nextDouble();
		
		double media = (n1 + n2 + n3) / 3;
		
		System.out.printf("O aluno %s ficou com a média: %.2f%n", nome, media);
		System.out.println("POPO");
		
		sc.close();
	}
}