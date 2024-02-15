package prog2_lista2;

public class Operario extends Empregado7 {
	private double valorProducao;
	private double comissao;
	
	public Operario( String nome, String cpf, String email,int numeroSeccao, double salarioBase, double INSS, double valorProducao,  double comissao ) {
		super(nome, cpf, email, numeroSeccao, salarioBase, INSS);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	public double calculaSalarioOP() {
		
		double salarioOP = super.calculaSalario() + (this.valorProducao * (this.comissao/100)); 	
		return salarioOP;
		}	
}
