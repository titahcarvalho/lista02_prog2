package prog2_lista2;

public class ContaCorrente extends ContaBancaria {
	private double limite;
	
	public ContaCorrente(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}
	
	@Override
	public  void sacar(double valor) {
		if( valor <= getSaldo() + this.limite) {
			valor =- getSaldo();
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo indisponível.");
		}
	}
	@Override
	public void tirarExtrato() {
		double valorConta = getSaldo() + this.limite;
		System.out.println("Valor atual na conta:" + valorConta);
		
	}
	@Override
	public void depositar(double valor) {
		valor += getSaldo();
		System.out.println("Valor de: " + valor +" depositado com sucesso");
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
