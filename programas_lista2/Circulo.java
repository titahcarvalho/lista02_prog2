package prog2_lista2;
import java.lang.Math;

public class Circulo implements ObjetoGeometrico {
	private double raio;
	
	public Circulo( double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio( double raio) {
		this.raio = raio;
	}
	@Override
	public void dadosGeometricos() {
		System.out.println("Círculo \n Raio: " + getRaio());
	}
	@Override
	public void calculaArea() {
		//double raio = 7;
		double area = Math.PI * (raio * raio);
		System.out.println("Área: " + area);
	}
	@Override
	public void calculaPerimetro() {
		//double raio = 7;
		double perimetro = 2 * Math.PI * raio;
		System.out.println("Perímetro: " + perimetro);
	}
	

}
