package questao1;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private String CPF;

	public Pessoa (String nome, String sobrenome, int idade, String cPF) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String toString() {
		return this.nome + " " + this.sobrenome;
	}
}
