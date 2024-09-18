package Tarefas;

public class Main {

	public static void main(String[] args) {
		// CRIA UM NOVO OBJETO A PARTIR DA CLASSE CACHORRO
		Cachorro c1 = new Cachorro();
		
		// DA SUAS RESPECTIVAS CATEGORIAS
		c1.nome = "Fofinho";
		c1.raca = "Buldog";
		c1.idade = 1;
		
		// EXDCUTA OS MÉTODOS
		c1.getNomeDoCachorro();
		c1.getRacaDoCachorro();
		c1.IdadeDoCachorroEmHumanos();
		System.out.printf("O cahorro tem "+ c1.idade +" e tem "+ c1.IdadeDoCachorroEmHumanos() +" anos humanos de vida.");
		System.out.println();
		c1.Latir();

	}

}