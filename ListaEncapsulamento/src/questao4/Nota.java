package questao4;

import java.util.List;

public class Nota{
		private String dono;
		private String texto;
		private boolean estado;
		protected List num;
		
		public Nota(String dono, String texto, boolean estado) {
			this.dono = dono;
			this.texto = texto;
			this.estado = estado;
		}

		public List getNum() {
			return num;
		}

		public void setNum(List num) {
			this.num = num;
		}

		public Nota(String dono,String texto) {
			this.dono = dono;
			this.texto = texto;
			this.estado = true;
		}

		public String getDono() {
			return dono;
		}

		public void setDono(String dono) {
			this.dono = dono;
		}

		public String getTexto() {
			return texto;
		}

		public void setTexto(String texto) {
			this.texto = texto;
		}

		public boolean isEstado() {
			return estado;
		}

		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		

}




