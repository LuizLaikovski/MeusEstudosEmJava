package _get_set_constr;
public class Caneta {
	private String modelo;
	private double ponta;
	private boolean tampa;
	private String cor;
	
//      MÉTODO CONSTRUTOR
	public void Caneta() {
		this.tampar();
		this.cor = "Rosa";
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
	
	public void status() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Sobre a Caneta: ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Modelo: "+ getModelo());
		System.out.println("Ponta: "+ getPonta());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
//      MÉTODOS PERONALISADOS
	public void tampar() {
		this.tampa = true;
	}
	public boolean getTampa() {
		return tampa;
	}
	public void setTampa(boolean tampa) {
		this.tampa = tampa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}