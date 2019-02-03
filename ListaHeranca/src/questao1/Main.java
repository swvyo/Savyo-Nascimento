package questao1;

public class Main {
	
	public static void main(String[]args) {
		
		Ingresso ingresso1 = new Ingresso();
		ingresso1.setValor(10);
		
		IngressoVip ingressoVip1 = new IngressoVip();
		ingressoVip1.setValor(15);
		ingressoVip1.setValorAdicional(5);
		
		
		System.out.println("Ingresso - "+ ingresso1.toString(ingresso1.getValor())+ " | Ingresso VIP - " + ingressoVip1.toString (ingresso1.getValor(),ingressoVip1.getValorAdicional()));
		
	}
}
