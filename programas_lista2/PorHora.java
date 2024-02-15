package prog2_lista2;

public class PorHora extends Empregado implements FolhadePagamento{
	private double valorHora;
	private int numHora;
	
	public PorHora( String nome, double valorHora, int numHora) {
		super(nome);
		this.valorHora = valorHora;
		this.numHora = numHora;
	}
	
	public void setValorHora(double v) {
		this.valorHora = v;
		
	}
	
	public void setNumHora(double v) {
		this.numHora = v;
		
	}
	public double getValorHora() {
		return valorHora;
		
	}
	public int getNumHora() {
		return numHora;
		
	}
	
	@Override
	public double getPay() {
		return valorHora * numHora;
		
	}
	@Override
	public void main() {
		
	}

}
