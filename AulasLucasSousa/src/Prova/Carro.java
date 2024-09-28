package Prova;

public class Carro {
	private String modelo;
	private String marca;
	private int ano;
	private String cor;
	private double valor;
	private boolean isAutomatico;
	private int quantidadePortas;
	private double consumoMedio;
	private String placa;
	private String combustivel;
	private double quantidaDeCombustivel;
	private double quilometragem;
	private String msg;
	
	// MÉTODO CONSTRUTOR
	public Carro(String modelo, String marca, int ano, String cor, double valor, boolean isAutomatico,
			int quantidadePortas, double consumoMedio, String placa, String combustivel, double quantidaDeCombustivel,
			double quilometragem) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		this.valor = valor;
		this.isAutomatico = isAutomatico;
		this.quantidadePortas = quantidadePortas;
		this.consumoMedio = consumoMedio;
		this.placa = placa;
		this.combustivel = combustivel;
		this.quantidaDeCombustivel = quantidaDeCombustivel;
		this.quilometragem = quilometragem;
	}

	
	//MÉTODOS GET E SET
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isAutomatico() {
		return isAutomatico;
	}

	public void setAutomatico(boolean isAutomatico) {
		this.isAutomatico = isAutomatico;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public double getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public double getQuantidaDeCombustivel() {
		return quantidaDeCombustivel;
	}


	public void setQuantidaDeCombustivel(double quantidaDeCombustivel) {
		this.quantidaDeCombustivel = quantidaDeCombustivel;
	}
	
	public double getQuilometragem() {
		return quilometragem;
	}


	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}


	public double calcularIPVA() {
		return this.getValor() * 0.05;
	}
	
	public double calcularValorVenda() {
		return this.getValor() - 0.15;
	}
	
	public void ligar() {
		System.out.println("LIGANDO");
	}
	
	public void desligar() {
		System.out.println("DESLIGANDO");
	}
	
	public void abastecer(double litros) {
		this.quantidaDeCombustivel = this.getQuantidaDeCombustivel() + litros;
	}
	
	public void andar(double distancia) {
		this.quilometragem =  this.quilometragem + distancia;
	}
	
	public void pintar(String novaCor) {
		this.cor = novaCor;
	}
	
	public void trocarPneu() {
		System.out.println("Estamos Trocando o Pneu de seu veiculo!!!");
	}
	
	public void mostrarInformacoes() {
		System.out.println("Modelo do seu veiculo:                 "+ this.getModelo());
		System.out.println("Marca do seu veiculo:                  "+ this.getMarca());
		System.out.println("Ano do seu veiculo:                    "+ this.getAno());
		System.out.println("Cor do seu veiculo:                    "+ this.getCor());
		System.out.println("Valor do seu veiculo:                  "+ this.getValor());
		System.out.println("É automatico?                          "+ this.isAutomatico());
		System.out.println("Quantidade de portas do seu veiculo:   "+ this.getQuantidadePortas());
		System.out.println("Consumo do seu veiculo:                "+ this.getConsumoMedio());
		System.out.println("Placa do seu veiculo:                  "+ this.getPlaca());
		System.out.println("Marca do seu veiculo:                  "+ this.getCombustivel());
	}
	
	public String compararCarro(String outroCarro) {
		if (this.getAno() > 2010) {
			String msg = ("O seu veiculo é mais novo");
		} else {
			String msg = ("O seu veiculo é mais velho");
		}
		return msg;
	}
	
}