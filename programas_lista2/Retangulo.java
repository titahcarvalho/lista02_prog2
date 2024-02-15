package prog2_lista2;

public class Retangulo implements ObjetoGeometrico {
	private double ladoA;
	private double ladoB;
	
	public Retangulo (double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
		
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
		
	}
	
	@Override
	public void dadosGeometricos() {
		System.out.println("Retangulo \n Lado A: " + getLadoA() + "Lado B: " + getLadoB());
	}
	@Override
	public void calculaArea() {
		double area = ladoA * ladoB;
		System.out.println("Área: " + area);
	}
	@Override
	public void calculaPerimetro() {
		double perimetro = 2 * ladoA + 2 * ladoB;
		System.out.println("Perímetro: " + perimetro);
		
	}

}
