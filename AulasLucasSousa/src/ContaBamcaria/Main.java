package ContaBamcaria;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.NumeroDaConta = 16012008;
		conta1.titular = "José Bezerra";
		conta1.saldo = 1000;
		
        System.out.println("Saldo Báncario: R$ " + conta1.consultarSaldo());
        conta1.DepositarDinheiro(500.0);
        System.out.println("Seu saldo após depósito: R$ " + conta1.consultarSaldo());
        conta1.SacarDinheiro(1200.0);
        System.out.println("Seu saldo após saque: R$ " + conta1.consultarSaldo());

	}

}