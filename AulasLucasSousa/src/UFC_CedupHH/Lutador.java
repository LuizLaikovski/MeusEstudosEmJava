package UFC_CedupHH;
public class Lutador {
	// ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitoria, derrotas, empates;
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String categoria, 
			int vitoria, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.vitoria = vitoria;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso < 52.2) {
			System.out.println("TU É MAGRO DE MAIS, PALITO DE DENTE NÃO PODE LUTAR!!!!!!!!!!!!!");
		} else if ((peso >=	70.3) && (peso <= 83.8)) {
			this.categoria = "LEVE";
		} else if((peso >= 83.9) && (peso <= 120.1)){
			this.categoria = "MÉDIO";
		} else if(peso >= 120.2) {
			this.categoria = "PESADO";
		}
		
		this.peso = peso;
	}
	public String getCategoria() {
		return categoria;
	}
	public int getVitoria() {
		return vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public String apresentar() {
		return this.nome;
	}
	
	public void status() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Nacionalidade: "+ this.nacionalidade);
		System.out.println("Idade: "+ this.idade);
		System.out.println("Altura: "+ this.altura);
		System.out.println("Peso: "+ this.peso);
		System.out.println("Categoria: "+ this.categoria);
		System.out.println("Vitórias: "+ this.vitoria);
		System.out.println("Derrotas: "+ this.derrotas);
		System.out.println("Empates: "+ this.empates);
	}
	
	public void ganharLuta(String lutador1, String lutador2) {
		System.out.println("O lutador"+ lutador1 +" ganhou do " + lutador2);
		this.vitoria += 1;
	}
	
	private void perderLuta(String lutador1, String lutador2) {
		System.out.println("O lutador"+ lutador1 +" perdeu do " + lutador2);
	}
	
	public void empatarLuta(String lutador1, String lutador2) {
		System.out.println("O lutador"+ lutador1 +" empatou com " + lutador2);
	}
}