package UFC_CedupHH;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafuante;
	private int rounds;
	private boolean aprovada;
	
	Random rand = new Random();
	
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafuante() {
		return desafuante;
	}

	public void setDesafuante(Lutador desafuante) {
		this.desafuante = desafuante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public void marcarLuta() {
		
	}
	
	public void lutar() {
		
	}
}
