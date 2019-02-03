package questao2;

public class Main {
	
	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("Empregado1", 400.00f);
		Gerente gerente1 = new Gerente("Gerente1", 1000.00f, "Departamento1");
		Vendedor vendedor1 = new Vendedor("Vendedor1", 700.00f, 20.0f);
		
		System.out.println(empregado1);
		System.out.println(gerente1);
		System.out.println(vendedor1);
	}

}
