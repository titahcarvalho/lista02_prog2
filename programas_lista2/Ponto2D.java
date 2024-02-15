package prog2_lista2;

public class Ponto2D {
	private int y;
	private int x;
	
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	//CONSTRUTORES
	public Ponto2D(int y, int x) {
		this.x = x;
		this.y=y;
		
	}
	public Ponto2D() {
		this(0,0);
	}
	
	//METODOS
	public double distancia(Ponto2D outroponto) {
		double deltaX = this.x - outroponto.getX();
		double deltaY = this.y - outroponto.getY();
		return (deltaY + deltaX * deltaY);
	}
	public double distancia() {
		Ponto2D origem = new Ponto2D();
		return this.distancia(origem);		
	}
	public String toString() {
		return "("+ x + "," + y + ")";
	}

}
