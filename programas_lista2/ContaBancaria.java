package prog2_lista2;

public abstract class ContaBancaria {
	private int numero;
	private double saldo;
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public abstract void sacar(double valor); //double valor
	public abstract void depositar(double valor);//double valor
	public abstract void tirarExtrato();
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
