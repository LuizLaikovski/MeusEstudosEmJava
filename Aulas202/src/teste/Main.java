package teste;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorito = new Cachorro();
		cachorito.nome = "Princeso";
		cachorito.raca = "Doberman";
		cachorito.idade = 3;
		
		cachorito.status();
		cachorito.latir();
	}

}
