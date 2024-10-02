package MetodoConstrutor;
public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	
	public void saque(double quantidade) {
		this.saldo = this.saldo - (quantidade + 5);
	}
	
}
