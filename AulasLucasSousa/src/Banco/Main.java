package Banco;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numc;
		String tipoC = null;
		String nome = null;
		boolean statusc = false;
		String popo = null;
		String r;
		double pop = 0;
		String rr = null;
		double rrr = 0;
		
		System.out.print("Digite o número da conta: ");
		numc = sc.nextInt();
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
		
		do {
			cliente.menu();
			int resp;
			System.out.print(">> "); resp = sc.nextInt();
			
			switch (resp) {
				case 1:
					double vd;
					System.out.println("Digite o valor a ser depositado em sua conta: "); vd = sc.nextDouble();
					cliente.Depositar(vd);
					break;
				case 2:
					double vs;
					System.out.println("Saldo : "+ cliente.getSaldo());
					System.out.print("Digite o valor a ser sacado: "); vs = sc.nextDouble() ;
					cliente.Sacar(vs);
					break;
				case 3:
					cliente.pagarAnuidade(pop, cliente.getSaldo());
					System.out.println("Deseja pagar[S/N]: "); 
					sc.nextLine();
					rr = sc.nextLine();
					if (rr.equalsIgnoreCase("s")) {
						System.out.println(cliente.retirarValor(cliente.taxa(pop , cliente.getSaldo()), cliente.getSaldo(), rrr));
					} else {
						System.out.println("Sua Transação não foi concluida.");
					}
					break;
				case 4:
					break;
				case 5:
					System.out.println("Sistema sera fechado, obrigado por usar nossos serviços.");
					System.out.println("Fechando...");
					break;
				default:
					System.out.println("Opção inválida");
					System.out.println("Sistema sera fechado, obrigado por usar nossos serviços.");
					System.out.println("Fechando...");
					break;
			}
			
			System.out.println("Deseja continuar [S/N]: ");
			r = sc.next();
			
		} while (r.equalsIgnoreCase("S") || r.equalsIgnoreCase("sim"));
		
		
		
		sc.close();
	}

}
