package prog2_lista2;

public class Natal extends CartaoWeb {
		private String nome;
		
		public Natal( String destinatario, String nome) {
			super(destinatario);
			this.nome = nome;
		}
		
		@Override
		public void showMessage() {
			System.out.println("Feliz Natal " + this.nome);
		}

	}

