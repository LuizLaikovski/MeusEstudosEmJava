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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

}