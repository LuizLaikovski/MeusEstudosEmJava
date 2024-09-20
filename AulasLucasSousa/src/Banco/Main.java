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
		String r;
		
		
		do {
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
			int resp;
			System.out.print(">> "); resp = sc.nextInt();
			
			switch (resp) {
				case 1:
					double vd;
					System.out.println("Digite o valor a ser depositado em sua conta: "); vd = sc.nextDouble();
					cliente.Depositar(vd);
					
				case 2:
					double vs;
					System.out.println("Saldo : "+ cliente.getSaldo());
					System.out.print("Digite o valor a ser sacado: "); vs = sc.nextDouble() ;
					cliente.Sacar(vs);
					
				case 3:
					
				case 4:
					
				default:
					System.out.println("Opção inválida");
					System.out.println("Sistema sera fechado, obrigado por usar nossos serviços.");
					System.out.println("Fechando...");
			}
			
			System.out.print("Deseja continuar [S/N]: ");
			r = sc.nextLine();
			
		} while (r.equalsIgnoreCase("S") || r.equalsIgnoreCase("sim"));
		
		
		
		sc.close();
	}

}
