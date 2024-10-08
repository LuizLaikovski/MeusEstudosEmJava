package Banco;
public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		deposito(saldo);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saque(double quantia) {
		this.saldo -= quantia + 5.00;
	}
	
	public void deposito(double quantia) {
		this.saldo += quantia;
	}

	@Override
	public String toString() {
		return "Conta: "+getNumero()+", "
				+"Titular: "+ getTitular()+", "
				+ String.format("Saldo: R$ %.2f", getSaldo());
	}
	
	
}
