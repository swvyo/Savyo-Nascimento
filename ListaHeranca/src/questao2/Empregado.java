package questao2;

public class Empregado {
	
	private String nome;
	protected float salario;
	
	public Empregado(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}

	public float getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;

	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Empregado: " + nome + "| Recebe:  " + salario + "R$.";
	}

}