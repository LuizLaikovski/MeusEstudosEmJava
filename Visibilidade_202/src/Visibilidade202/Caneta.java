package Visibilidade202;
public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta de cor " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? >> " + this.tampada);
	}
	
	protected void rabiscar() {
		if (this.tampada == true) {
			System.out.println("NÃO POSSO ESCREVER");
		} else {
			System.out.println("Estou escrevendo");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
}
