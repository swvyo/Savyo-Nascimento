package questao3;

public class Recursivo {

		public int calcular(int fat) {
			if (fat <= 1) {
				return 1;
			} else {
				return calcular(fat - 1) * fat;
			}
		}

}
