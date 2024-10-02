package MetodoConstrutor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da conta  : "); int numConta = sc.nextInt();
		System.out.println("Informe o nome do titular  : "); String nomeTitular = sc.next();
		System.out.println("Tem deposito inicial[S / N]: "); String opc = sc.next();
		
		double deposito;
		if (opc.contentEquals("s") || opc.contentEquals("S") || opc.contentEquals("sim")) {
			System.out.println("Digite o valor do deposito: "); deposito = sc.nextDouble();
		} else {
			deposito = 0;
		}
		
		Conta contaBanConta = new Conta(numConta, nomeTitular, deposito);
		
		System.out.println("Dados da Conta: ");
		System.out.printf("Conta: %d, Titular: %s, Saldo: %.2f   %n", contaBanConta.getNumero(), contaBanConta.getTitular(), contaBanConta.getSaldo());
		
		
		double Newdeposito;
		System.out.println("Informe o valor do depósito: "); Newdeposito = sc.nextDouble();
		contaBanConta.depositar(Newdeposito);
		System.out.printf("Conta: %d, Titular: %s, Saldo: %.2f   %n", contaBanConta.getNumero(), contaBanConta.getTitular(), contaBanConta.getSaldo());
		
		
		double ValorDeSaque;
		System.out.println("Informe o valor do saque: "); ValorDeSaque = sc.nextDouble();
		contaBanConta.saque(ValorDeSaque);
		System.out.printf("Conta: %d, Titular: %s, Saldo: %.2f   %n", contaBanConta.getNumero(), contaBanConta.getTitular(), contaBanConta.getSaldo());
		
		
		sc.close();
	}
}