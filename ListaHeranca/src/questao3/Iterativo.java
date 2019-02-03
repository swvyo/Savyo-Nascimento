package questao3;

public class Iterativo {

		int num = 1;

		public int calcular(int fat) {
			for(int i=1; i<= fat; i++) {
				num *= i;
			}
			return num;
		}	
	}

