package prog2_lista2;

public class ContaPoupanca extends ContaBancaria {
	private double taxa;
	
	public ContaPoupanca( int numero, double saldo, double taxa) {
		super(numero, saldo);
		this.taxa = taxa;
	}
	
	@Override
	public void tirarExtrato() {
		double saldoTotal = getSaldo() * this.taxa;
		System.out.print("Saldo da conta:" + saldoTotal);
	}
	@Override 
	public void sacar(double valor) {
		if( valor <= getSaldo()) {
			valor =- getSaldo();
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo indisponível.");
		}
	}
	@Override
	public void depositar(double valor) {
		valor += getSaldo();
		System.out.println("Valor de: " + valor +" depositado com sucesso");
		
	}
}
