package Encapsulamento;
public class ControleRemoto implements Controlador{
	// ATRIBUTOS
	private int voleume;
	private boolean ligado;
	private boolean tocando;
	
	//MÉTODOS ESPECIAIS
	// MÉTODO CONSTRUTOR
	public ControleRemoto(int voleume, boolean ligado, boolean tocando) {
		this.voleume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	// MÉTODO GET E SET

	public int getVoleume() {
		return voleume;
	}
	public void setVoleume(int voleume) {
		this.voleume = voleume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isTocando() {
		return tocando;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	// MÉTODOS PERSONALIZADOS
	@Override
	public void ligar() {
		setLigado(true);
		
	}
	@Override
	public void desligar() {
		setLigado(false);
	}
	@Override
	public void abrirMenu() {
		System.out.println("A TV está : "+ this.ligado);
		System.out.println("A TV está reproduzindo ou está pausada: "+ this.tocando);
		System.out.println("O volume está "+ this.voleume +"%");
		
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechar Menu");
		
	}
	@Override
	public void maisVolume() {
		if (this.ligado == true) {
			this.voleume += 10;
		} else {
			System.out.println("A TV ESTÁ DESLIGADA");
		}
	}
	@Override
	public void menosVolume() {
		if (this.ligado == true) {
			this.voleume -= 10;
		} else {
			System.out.println("A TV ESTÁ DESLIGADA");
		}
	}
	@Override
	public void ligarMudo() {
		if ((this.ligado == true) && (this.voleume < 0)) {
			this.voleume = 0;
		} else {
			System.out.println("A TV JÁ ESTÁ NO MUDO");
		}
	}
	@Override
	public void desligarMudo() {
		if ((this.ligado == true) && (this.voleume == 0)) {
			System.out.println("O MUDO ESTÁ DESLIGADO AGR");
		} else {
			System.out.println("O MUDO JA ESTÁ DESLIGADO");
		}
		
	}
	@Override
	public void play() {
		if ((this.ligado == true) && (this.tocando == false)) {
			this.tocando = true;
			System.out.println("A TV VAI COMEÇAR A REPRODUZIR");
		} else {
			System.out.println("A TV JÁ ESTÁ REPRODUZINDO");
		}
	}
	@Override
	public void pause() {
		if ((this.ligado == true) && (this.tocando == true)) {
			this.tocando = false;
			System.out.println("A TV ESTÁ PAUSADA");
		} else {
			System.out.println("O PROGRAMA ESTÁ PAUSADA");
		}
	}

}