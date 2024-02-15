package prog2_lista2;

public class Empregado7 extends Pessoa {
	private int numeroSeccao;
	private double salarioBase;
	private double INSS;
	
	public Empregado7 (String nome, String cpf, String email, int numeroSeccao, double salarioBase, double INSS) {
		super(nome, cpf, email);
		this.INSS = INSS;
		this.numeroSeccao = numeroSeccao;
		this.salarioBase = salarioBase;
		
	}
	
	public int getNumeroSeccao() {
		return numeroSeccao;
	}
	public void setNumeroSeccao( int numeroSeccao) {
		this.numeroSeccao = numeroSeccao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getINSS() {
		return INSS;
	}

	public void setINSS(double iNSS) {
		INSS = iNSS;
	}
	
	public double calculaSalario() {
		double descontoINSS = salarioBase + (INSS/100);
		double salarioLiquido = salarioBase - descontoINSS;
		return salarioLiquido;
	}

}
