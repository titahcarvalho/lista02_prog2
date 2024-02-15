package prog2_lista2;

public class TrianguloIsosceles extends Triangulo implements ObjetoGeometrico{
	
	public TrianguloIsosceles ( double lado1, double lado2) {
		super(lado1, lado2, lado2);
	}
	@Override
	public void dadosGeometricos() {
		System.out.println("Triangulo Isosceles \n Dados lado 1:" + getLado1() + "Dados lado 2:" + getLado2());
	}
	@Override
	public void calculaArea() {
		
	}
	@Override
	public void calculaPerimetro() {
		
	}

}
