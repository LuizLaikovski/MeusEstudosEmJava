package Tarefas;
public class Cachorro {
	// ATRIBUTOS DO CACHORRO
	String nome;
	String raca;
	int idade;
	

	void getNomeDoCachorro() {
		System.out.println("O cachorro se chama: "+ nome);
	}
	
	void getRacaDoCachorro() {
		System.out.println("O cachorro é da raça "+ raca);
	}
	
	double IdadeDoCachorroEmHumanos() {
		double anoshumanos = idade * 7;
		return anoshumanos;
	}
	
	void Latir() {
		System.out.println("AU AU!!");
	}
}
