package defult;

import java.util.Locale;
import java.util.Scanner;

public class FormulaDeHeron {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		System.out.println("Digite as medidade do triângulo 1:");
		System.out.print("Lado A: "); t1.ladoA = sc.nextDouble();
		System.out.print("Lado B: "); t1.ladoB = sc.nextDouble();
		System.out.print("Lado C: "); t1.ladoC = sc.nextDouble();
		System.out.println();
		System.out.println("Digite as medidade do triângulo 2:");
		System.out.print("Lado A: "); t2.ladoA = sc.nextDouble();
		System.out.print("Lado B: "); t2.ladoB = sc.nextDouble();
		System.out.print("Lado C: "); t2.ladoC = sc.nextDouble();
		
		double area01 = t1.area();
		double area02 = t2.area();
		
		System.out.println();
		System.out.printf("Área do triângulo 1: %.4f%n",area01);
		System.out.printf("Área do triângulo 2: %.4f%n",area02);
		System.out.println();
		if (area01 > area02) {
			System.out.println("Maior área: Triângulo 1");
		} else {
			System.out.println("Maior área: Triângulo 2");
		}
		
		sc.close();
	}
}