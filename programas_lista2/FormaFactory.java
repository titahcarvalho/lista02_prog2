package prog2_lista2;

public class FormaFactory {
	public FormaGeometrica getForma(String tipo) { //factory method{
		if( tipo == null) {
			return null;
		} if (tipo.equalsIgnoreCase("Circulo_P")){
			return new Circulo_P();
			
		} else if (tipo.equalsIgnoreCase("Quadrado_P")){
			return new Quadrado_P();
			
		} else if (tipo.equalsIgnoreCase("Triangulo_P")){
			return new Triangulo_P();
		}
		return null;
	}
}
