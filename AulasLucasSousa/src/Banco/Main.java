package Banco;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numc;
		String tipoC = null;
		String nome = null;
		boolean statusc = false;
		String popo = null;
		
		
		System.out.print("Digite o número da conta: ");
		numc = sc.nextDouble();
		sc.nextLine();
		System.out.print("Digite o tipo de conta que você deseja criar: ");
		tipoC = sc.nextLine();
		System.out.print("Digite o nome(completo) do proprietáio: ");
		nome = sc.nextLine();
		System.out.print("Digite se a conta estará ativa ou não(sim/nao): ");
		popo = sc.nextLine();
		
		if (popo.equalsIgnoreCase("sim")) {
			statusc = true;
		} else {
			statusc = false;
		}
		
		ContaBanco cliente = new ContaBanco(numc, tipoC, nome, 0.0, statusc);
		
		cliente.status();
		
		cliente.menu();
		
		sc.close();
	}

}
