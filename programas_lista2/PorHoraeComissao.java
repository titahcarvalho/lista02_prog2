package prog2_lista2;

public class PorHoraeComissao extends PorHora implements FolhadePagamento{
		private double vendas;
		
		public PorHoraeComissao(String nome, double ValorHora, int numHora, double vendas) {
			super(nome, valorHora, numHora);
			this.vendas = vendas;
			
		}
		public void serVendas (double s) {
			this.vendas = s;
			
		}
		public void printPay() {
			System.out.println("Nome: " + getNome());
	        System.out.println("Salário base: " + getPay());
	        System.out.println("Comissão: " + (COMMISSION_RATE * vendas));
	        System.out.println("Salário total: " + (getPay() + COMMISSION_RATE * vendas));
			
		}
		public double getPay() {
			
		}
}
