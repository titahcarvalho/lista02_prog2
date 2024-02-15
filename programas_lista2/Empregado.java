package prog2_lista2;

public abstract class Empregado implements FolhadePagamento {
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome( String nome) {
		this.nome = nome;
	}
	
	public Empregado(String nome) {
		this.nome = nome;
	}
	
	//public void printPay();
	public abstract double getPay(); //método abstrato que deve ser implementado nas subclasses
		
}
