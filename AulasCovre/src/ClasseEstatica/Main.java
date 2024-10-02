package ClasseEstatica;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio"); double raio = sc.nextDouble();
		
		double c = Caulculadora.cirucnferencia(raio);
		double v = Caulculadora.volume(raio);
		
		System.out.println("");
		System.out.printf("Circunferencia: %.2f %n", c);
		System.out.printf("Volume        : %.2f %n", v);
		System.out.printf("Valor de PI  : %.2f %n", Caulculadora.PI);
		
		sc.close();
	}

}
