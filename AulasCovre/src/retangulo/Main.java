package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double larg = 0;
		System.out.println("Digite a Largura do Retangulo: "); larg = sc.nextDouble();
		double altu = 0;
		System.out.println("Digite a Altura do Retangulo: "); altu = sc.nextDouble();
		
		Retangulo forma = new Retangulo(larg, altu);
		
		System.out.printf("Área: %.2f %n", forma.area());
		System.out.printf("Perimêtro: %.2f %n", forma.perimetro());
		System.out.printf("Diagonal: %.2f %n", forma.diagonal());
		
		sc.close();
	}
}