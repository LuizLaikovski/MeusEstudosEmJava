package PrimeiroArray;
public class Produtos {
	public String nome;
	public double preco;
	

	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString() {
		return nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}	
}