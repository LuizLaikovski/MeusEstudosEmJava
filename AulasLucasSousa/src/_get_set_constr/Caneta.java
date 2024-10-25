package _get_set_constr;
public class Caneta {
	private String modelo;
	private double ponta;
	private boolean tampa;
	private String cor;
	
//      MÉTODO CONSTRUTOR
	public Caneta(String m, String c, double p) {
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.tampa = true;
	}
//  MÉTODOS ESPECIAIS
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public double getPonta() {
		return this.ponta;
	}
	
	public void setPonta(double p) {
		this.ponta = p;
	}
	
	public boolean getTampa() {
		return tampa;
	}
	public void setTampa(boolean t) {
		this.tampa = t;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	
//      MÉTODOS PERONALISADOS
	
	public void tampar() {
		this.tampa = true;
	}
	
	public void destampar() {
		this.destampar();
	}
	
	public void status() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Sobre a Caneta: ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Modelo: "+ getModelo());
		System.out.println("Ponta: "+ getPonta());
		System.out.println("Cor: " + getCor());
		System.out.println("Tampada?  >> "+ this.getTampa());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
}