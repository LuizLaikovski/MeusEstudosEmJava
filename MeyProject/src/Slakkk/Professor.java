package Slakkk;

public class Professor {
	private String nome;
	private String materia;
	private int quantidadeAulasSemanal;
	private float Salario;
	private boolean EBemComido;
	
	public Professor(String nome, String materia, int quantidadeAulasSemanal, float salario, boolean eBemComido) {
		super();
		this.nome = nome;
		this.materia = materia;
		this.quantidadeAulasSemanal = quantidadeAulasSemanal;
		Salario = salario;
		EBemComido = eBemComido;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getQuantidadeAulasSemanal() {
		return quantidadeAulasSemanal;
	}
	public void setQuantidadeAulasSemanal(int quantidadeAulasSemanal) {
		this.quantidadeAulasSemanal = quantidadeAulasSemanal;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	public boolean isEBemComido() {
		return EBemComido;
	}
	public void setEBemComido(boolean eBemComido) {
		EBemComido = eBemComido;
	}
	
	
}
