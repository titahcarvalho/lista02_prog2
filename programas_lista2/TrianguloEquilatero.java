package prog2_lista2;
import java.lang.Math;

public class TrianguloEquilatero extends Triangulo implements ObjetoGeometrico{
	
	public TrianguloEquilatero( double lado1) {
		super(lado1, lado1, lado1); //os lados do triangulo equilatero são iguais
	}
	@Override
	public void dadosGeometricos() {
		System.out.println("Triangulo Equilatero \n Dados:" + getLado1());
	}
	@Override
	public void calculaArea() {
		double area = Math.sqrt((3)/4 * 0.5 * Math.pow(getLado1(),2));//ATENÇÃO AQUI 
		System.out.print("Área: " + area );
	}
	@Override
	public void calculaPerimetro() {
		double perimetro = (getLado1() + getLado1() + getLado1());
		System.out.print("Perímetro: " + perimetro );
	}

}
