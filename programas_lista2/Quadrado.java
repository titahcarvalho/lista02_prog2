package prog2_lista2;

public class Quadrado extends Retangulo implements ObjetoGeometrico{
	
	public Quadrado(double lado) {
		super(lado, lado);
		
	}
	@Override
	public void dadosGeometricos() {
		System.out.println("Quadrado \n Dados:" + getLadoA());
	}
	@Override
	public void calculaArea() {
		
	}
	@Override
	public void calculaPerimetro() {
		
	}

}
