package questao2;

public class Funcionarios {
	
	private String Nome;
	private String cpf;
	private String email;
	private String registroUnico;
	private String dataNascimento;
	private String funcao;
	private int senha;
	
	public boolean realizarLogin(String email,int senha) {

	if( ((this.email == email)||(this.registroUnico == email)) && this.senha == senha) {
		
		System.out.println(this.Nome +" É UM "+this.funcao);
		return true;
	}
		
	else
	{
		return false;
	}
}
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRegistroUnico() {
		return registroUnico;
	}
	
	public void setRegistroUnico(String registroUnico) {
		this.registroUnico = registroUnico;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}