package Banco;

public class ContaBanco {
	public double numconta;
	protected String tipo;
	private String proprietario;
	private double saldo;
	private boolean status;
	

	public ContaBanco(double nc, String t, String p, double sl, boolean s) {
		this.setNumconta(nc);
		this.setTipo(t);
		this.setProprietario(p);
		this.setSaldo(sl);
		this.setStatus(s);
	}
	
	
	public double getNumconta() {
		return numconta;
	}
	public void setNumconta(double numconta) {
		this.numconta = numconta;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void status() {
		System.out.println("---------------------------------");
		System.out.println("         Banco do Brasil         ");
		System.out.println("---------------------------------");
		System.out.println("Número da conta: "+ getNumconta());
		System.out.println("Tipo da Conta: "+ getTipo());
		System.out.println("Proprietário: "+ getProprietario());
		System.out.println("Saldo Atual: "+ getSaldo());
		System.out.println("Status da Conta: "+ getStatus());
	}
	
	public void menu() {
		System.out.println("---------------------------------");
		System.out.println("         Banco do Brasil         ");
		System.out.println("---------------------------------");
		System.out.println();
	}
	
	
	public void abrirConta() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Você abriu sua conta!");
		System.out.println("---------------------------------");
	}
	
	public void fecharConta() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Você fechou sua conta!");
		System.out.println("---------------------------------");
	}
	
	public void Depositar(double v) {
		if (v > 0) {
			this.saldo += v;
		} else {
			System.out.println("Você digitou alguma coisa errada!!!");
		}
	}
	
	public void Sacar(double s) {
		if (s > 0) {
			this.saldo -= s;
		} else if (s <= 0) {
			System.out.println("Você digitou algum valor negativo ou o número 0");
		} else {
			System.out.println("Você sacou :"+ s);
		}
	}
	
	
}
