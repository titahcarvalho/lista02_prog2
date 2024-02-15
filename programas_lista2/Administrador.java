package prog2_lista2;

public class Administrador extends Empregado7   {
	private double ajudadeCusto;
	
	public Administrador( String nome, String cpf, String email,int numeroSeccao, double salarioBase, double INSS, double ajudadeCusto) {
		super(nome, cpf, email, numeroSeccao, salarioBase, INSS);
		this.ajudadeCusto = ajudadeCusto;
	}
	public double calculaSalario() {
		double salarioAdm = super.calculaSalario() + this.ajudadeCusto;
		return salarioAdm;
	}
	
	

}
