package Empresa;

public class Funcionario {
	int id;
	String nome;
	double salario;
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return "ID = " + id + ", NOME = " + nome + ", SALARIO = " + salario;
	}
	
	public void aumentaSalario(int porcentagem) {
		this.salario += (this.salario/100) * porcentagem;
	}
}
