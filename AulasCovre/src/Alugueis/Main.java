package Alugueis;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem Vindo ao Pousadas Mocorrongo");
		System.out.println("No momento estamos com um total de 10 quartos disponivéis!!");
		System.out.println("Quantos quartos serão alugados? "); int quantidade = sc.nextInt();
		
		if (quantidade < 10 && quantidade > 0) {
			Pensionato[] quartos = new Pensionato[10];
			
			for (int i = 0; i < quantidade; i++) {
				System.out.println("Aluguel "+ (i+1) +":");
				System.out.print("Nome: "); String nome = sc.next();
				System.out.print("E-mail: "); String email = sc.next();
				System.out.print("Número do quarto: "); int NumQuarto = sc.nextInt();
				
				quartos[NumQuarto] = new Pensionato(nome, email, NumQuarto);
			}
			
			System.out.println("Quartos Ocupados: ");
			for (int i = 0; i < 10; i++) {
				if (quartos[i] != null) {
					System.out.println(quartos[i].getQuarto()+" : "+ quartos[i].getNome() +", "+  quartos[i].getEmail() +"");
				}
			}
		} else {
			System.out.println("O SEU MOCORRONGO SÓ TEM 10 QUARTOS. IMBECIL");
		}
		
		
		sc.close();
	}

}