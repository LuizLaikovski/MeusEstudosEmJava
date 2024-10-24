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
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, 
			int vitoria, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
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
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio" ;
		} else if (this.peso <= 120.2) {
			this.categoria = "PESADO";
		} else {
			System.out.println("TU É UM PLANETA, METE O PÉ DAQUI O JUPITER");
		}
		
		this.categoria = categoria;
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

	public void apresentar() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("                          CHEGOU A HORA");
		System.out.println("                    VAMOS APRESENTAR O LUTADOR");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("NOME: "+ this.nome);
		System.out.println("DIRETAMENTE DO(A): "+ this.nacionalidade);
		System.out.println("COM  "+ this.idade+" ANOS E "+ this.peso +"KG");
		System.out.println("COM UMA ALTURA DE "+ this.altura);
		System.out.println(this.vitoria+" DE VITÓRIAS");
		System.out.println(this.derrotas+" DE DERROTAS");
		System.out.println(this.empates+" DE EMPATES");
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public void status() {
		System.out.println("O  "+ this.nome + " é um peso " + this.getCategoria());
		System.out.println("Ganhou "+ this.vitoria + " lutas");
		System.out.println("Perdeu "+ this.derrotas + " lutas");
		System.out.println("Empatou "+ this.empates + " lutas");
	}
	
	public void ganharLuta() {
		this.vitoria += 1;
	}
	
	public  void perderLuta() {
		this.derrotas += 1;
	}
	
	public void empatarLuta() {
		this.empates += 1;
	}
	
}