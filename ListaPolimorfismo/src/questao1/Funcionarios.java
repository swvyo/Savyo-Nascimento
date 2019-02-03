package questao1;

public class Funcionarios {
	
	private String Nome;
	private String cpf;
	private String email;
	private int registroUnico;
	private String dataNascimento;
	private String funcao;
	private int senha;
	
	public boolean realizarLogin(String email,int senha) {
		
	if( this.email == email && this.senha == senha) {
			
	return true;
	}
		
	else 
	{
		return false;
	}
}
	
	public boolean realizarLogin(int registroUnico,int senha) {
		
	if( this.registroUnico == registroUnico && this.senha == senha){
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
	
	public int getRegistroUnico() {
		return registroUnico;
	}
	public void setRegistroUnico(int registroUnico) {
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
