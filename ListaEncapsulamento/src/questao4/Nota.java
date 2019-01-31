package questao4;

import java.util.List;

public class Nota {
		private String dono;
		private String texto;
		private boolean estado;
		protected List numero;
		
		public Nota(String dono, String texto, boolean estado) {
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
		
		public List getNumero() {
			return numero;
		}

		public void setNum(List numero) {
			this.numero = numero;
		}

		public Nota(String dono,String texto) {
			this.dono = dono;
			this.texto = texto;
			this.estado = true;
			
		}
	}

