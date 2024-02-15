package prog2_lista2;

public class TrianguloEscaleno extends Triangulo implements ObjetoGeometrico{
	public TrianguloEscaleno ( double lado1, double lado2, double lado3) {
		super( lado1, lado2, lado3);
	}
	@Override
	public void dadosGeometricos() {
		System.out.println("Triangulo escaleno \n Dados:" + getLado1() + "\n Lado2: " + getLado2() + "\n Lado 3: " + getLado3());
	}
	@Override
	public void calculaArea() {
		
	}
	@Override
	public void calculaPerimetro() {
		
	}

}
