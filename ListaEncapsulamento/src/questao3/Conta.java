package questao3;

public class Conta {

	private int numeroConta;
	private float saldo;

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void depositar(int numeroConta, float valor) {
		if (validarConta(numeroConta)) {
			this.saldo = this.saldo + valor;
			System.out.printf("Conta: %s | Deposito: %.2f R$", valor, numeroConta);
		} else {
			System.out.printf("Não foi possivel realizar o deposito!%n");
		}
	}

	public void sacar(int numeroConta, float valor) {
		if (validarSaque(valor) && validarConta(numeroConta)) {
			this.saldo = this.saldo - valor;
			System.out.printf("Conta: %s | Saque: %.2f R$", valor, numeroConta);
		} 
		
		else {
			System.out.printf("Não foi possivel realizar o saque!%n");
		}
	}
	
	public boolean validarConta(int numeroConta) {
		if(this.numeroConta == numeroConta) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean validarSaque(float valor) {
		if(this.saldo >= valor) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
}