package Banco;

public class ContaBanco {
	public String numconta;
	protected String tipo;
	private String proprietario;
	private double saldo;
	private boolean status;
	

	public ContaBanco(String nc, String t, String p, double sl, boolean s) {
		this.setNumconta(nc);
		this.setTipo(t);
		this.setProprietario(p);
		this.setSaldo(sl);
		this.setStatus(s);
	}
	
	public String getNumconta() {
		return numconta;
	}
	public void setNumconta(String numconta) {
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
	
}
