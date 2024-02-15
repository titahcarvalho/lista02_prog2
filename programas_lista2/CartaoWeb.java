package prog2_lista2;

public abstract class CartaoWeb {
	private String destinatario;
	
	public CartaoWeb(String destinarario) {
		this.destinatario = destinatario;
	}
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public abstract void showMessage();

}
