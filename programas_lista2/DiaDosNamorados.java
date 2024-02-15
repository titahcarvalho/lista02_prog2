package prog2_lista2;

public class DiaDosNamorados extends CartaoWeb {
	private String nome;
	
	public DiaDosNamorados( String destinatario, String nome) {
		super(destinatario);
		this.nome = nome;
	}
	
	
	@Override
	public void showMessage() {
		System.out.println("Feliz dia do(a) namorado(a) " + this.nome);
	}

}
