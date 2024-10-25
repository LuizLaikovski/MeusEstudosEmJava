package Funcionários;
public class Empregado {
	private String nome;
	private double salario;
	private double imposto;
	
	public Empregado(String n, double s, double i) {
		this.nome = n;
		this.salario = s;
		this.imposto = i;
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
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double salarioLiquido() {
		return this.salario - this.imposto;
	}
	
	public void aumentaSalario(double porcenagem) {
		this.salario = (((this.salario / 100)* porcenagem) + this.salario) - this.imposto;
	}
}
