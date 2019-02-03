package questao1;

public class IngressoVip extends Ingresso {
	
	private float valorAdicional;
	
	public String toString (float valor, float valorAdicional) {
		float total = super.getValor() + this.valorAdicional;
		return "Valor: " + total;
	}
	
	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional (float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public float getValor (float valor, float valordicional) {
		float total = super.getValor() + this.valorAdicional;
		return total;
	}
	
	
}

