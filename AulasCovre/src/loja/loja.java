package loja;
public class Loja {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return nome +", R$ " + preco +", " + quantidade + " unidades" + ", Total: R$ " + valorEstoque();
	}
	
	
}
