package prog2_lista2;
import java.lang.Math;

public class Triangulo implements ObjetoGeometrico{
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo( double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2= lado2;
		this.lado3= lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	@Override
	public void dadosGeometricos() {
		System.out.println("Triangulo \n  Lado 1:" + getLado1() + "\n Lado 2:" + getLado2() + "\n Lado 3:" + getLado3());
		
	}
	@Override
	public void calculaArea() {
		double area = Math.sqrt(0.5 * (0.5 * getLado1()) * (0.5 * getLado2()) *(0.5 *  getLado3()));
		System.out.print("Área: " + area );
	}
	@Override
	public void calculaPerimetro() {
		double perimetro = (getLado1() + getLado2() + getLado3());
		System.out.print("Perímetro: " + perimetro );
	}
}
