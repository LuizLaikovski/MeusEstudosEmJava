package ContaBamcaria;

public class ContaBancaria {
	// ATRIBUTOS
    public int NumeroDaConta;
    public String titular;
    public double saldo;


    // DEPOSITA O DINHEIRO NA CONTA
    public void DepositarDinheiro(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Você depositou R$ " + valor + " na sua conta");
        } else {
            System.out.println("O valor digitado é inváido");
        }
    }

    // SACA O DINHEIRO
    public void SacarDinheiro(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // CONSULTAR O SALDO NA CONTA BANCARIA
    public double consultarSaldo() {
        return saldo;
    }

}
