package retangulo;

public class Retangulo {
	private double altura;
	private double largura;
	
	// MÉTODO CONSRTUTOR
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	// MÉTODOS ESPECIAIS
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double area() {
		return getLargura() * getAltura();
	}
	
	public double perimetro() {
		return 2 * (getLargura() + getAltura()); 
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(getAltura(), 2)) + (Math.pow(getLargura(), 2)));
	}
	
}