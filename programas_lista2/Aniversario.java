package prog2_lista2;

public class Aniversario extends CartaoWeb {
	private String nome;
	
	public Aniversario( String destinatario, String nome) {
		super(destinatario);
		this.nome = nome;
	}
	
	@Override
	public void showMessage() {
		System.out.println("Feliz aniversario " + this.nome);
	}

}


