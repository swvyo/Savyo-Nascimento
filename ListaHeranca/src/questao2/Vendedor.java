package questao2;


public class Vendedor extends Empregado {

	private float percentComissao;

	public Vendedor(String nome, float salario, float percentComissao) {
		super(nome, salario);
		this.percentComissao = percentComissao;
	}

	public float getpercentComissao() {
		return percentComissao;
	}

	public void setpercentComissao(float percentComissao) {
		this.percentComissao = percentComissao;
	}

	public float calcularSalario() {
		return this.salario + (salario * (percentComissao / 100));
	}

	public String toString() {
		return "Vendedor: " + getNome() + "| Recebe: " + salario + " | Salario final: " + calcularSalario() + "R$"
				+ " | Comissão: " + percentComissao + "%.";
	}
}