package Conversao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Dólar: "); double dol = sc.nextDouble();
		System.out.println("Digite o valor em reais que deseja converter: "); double re = sc.nextDouble();
		System.out.printf("Valor a ser pago em reais: %.2f", CurrencyConverter.converter(dol, re));
		
		sc.close();
	}

}
