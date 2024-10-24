package UFC_CedupHH;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;


	public Lutador getDesafiado() {
		return desafiado;
	}


	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}


	public Lutador getDesafiante() {
		return desafiante;
	}


	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
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

	public String marcarLuta(Lutador lutador1, Lutador lutador2) {
		if ((lutador1.getCategoria() == lutador2.getCategoria()) && (lutador1 != lutador2)) {
			this.aprovada = true;
			this.desafiante = lutador1;
			this.desafiado = lutador2;
			return "VAMO DALE NO PAU";
		} else if (lutador1 == lutador2) {
			this.aprovada = false;
			System.out.println("SEU ANIMAL, VOCÊ NÃO PODE LUTAR COM VOCE MESMO");
			this.desafiante = null;
			this.desafiado = null;
			return "Mesma pessoa";
		} else if ((lutador1 != lutador2) && (lutador1.getCategoria() != lutador2.getCategoria())) {
			this.aprovada = false;
			System.out.println("SEUS BABUINOS, VOCÊS SÃO DE CATEGORIAS DIFERENTES");
			this.desafiante = null;
			this.desafiado = null;
			return "Categorias diferentes";
		} else {
			System.out.println("A LUTA NÃO VAI ACONTECER");
		}
		return null;
	}
	
	public void lutar() {
		if (this.aprovada == true) {
			System.out.println("======================= Desafiante =======================");
			this.desafiante.apresentar();
			System.out.println("======================= Desafiado =======================");
			this.desafiado.apresentar();
			
			Random resultado = new Random();
			int vencedor = resultado.nextInt(3);
			
			
			switch (vencedor) {
			case 0://empate
				System.out.println("EMPATE");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1://desafiado vencer
				System.out.println("Vitória do "+ this.desafiado.getNome() +".");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2://desafiante vencer
				System.out.println("Vitória do "+ this.desafiante.getNome() +".");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
		} else {
			System.out.println(marcarLuta(this.desafiante, this.desafiado));
		}
	}
}