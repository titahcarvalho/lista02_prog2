package prog2_lista2;

public class PorComissao extends Empregado implements FolhadePagamento  {
		private double vendas;
		
		public PorComissao(String nome,double vendas) {
			super(nome);
			this.vendas = vendas;
		}
		
		public double getVendas() {
			return vendas;
		}
		
		public void porComissao() {
			
		}
		
		public void setVendas(double s) {
			
		}
		@Override 
		public double getPay() {
			
		}
		@Override
		public void main() {
			
		}
	}


