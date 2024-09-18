package teste;

public class Cachorro {
	public String nome;
	public String raca;
	public int idade;
	
	public void status() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Raça: " + this.raca);
		System.out.println("Idade em anos humanos: "+ this.idade * 7);
	}
	
	public void latir() {
		System.out.println("Latindo: AU AU AU");
	}
}
