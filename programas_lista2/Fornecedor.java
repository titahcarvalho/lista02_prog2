package prog2_lista2;

public class Fornecedor extends Pessoa {
	private double credMax;
	private double valorDivida;
	
	public Fornecedor(String nome, String cpf, String email, double credMax, double valorDivida) {
		super(nome, cpf, email);
		this.credMax = credMax;
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		double dif;
		dif = credMax - valorDivida;
		return dif;
	}
	

}
