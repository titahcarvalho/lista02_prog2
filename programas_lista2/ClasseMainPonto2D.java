package prog2_lista2;

public class ClasseMainPonto2D {

	public static void main(String[] args) {
		Ponto2D pontoA = new Ponto2D(3,4);
		Ponto2D pontoB = new Ponto2D(8,6);
		
		System.out.println("Coordenadas do ponto A:" + pontoA);
		System.out.println("Coordenadas do ponto B:" + pontoB);
		
		double distanciaAB = pontoA.distancia(pontoB);
		System.out.println("Distancia do ponto A ao ponto B:" + distanciaAB);
		
		double distanciaAOrigem = pontoA.distancia();
		System.out.println("Distancia do ponto A a origem:" + distanciaAOrigem);
		
		
		System.out.println("-----------------------------------------------");
		
		Reta reta1 = new Reta();
		Reta reta2 = new Reta(new Ponto2D (3,4));
		Reta reta3 = new Reta(new Ponto2D(1,2), new Ponto2D(3,4));
		Reta reta4 = new Reta(1,2,3,4);
		
		System.out.println("Reta 1:" + reta1);
		System.out.println("Reta 2:" + reta2);
		System.out.println("Reta 3:" + reta3);
		System.out.println("Reta 4:" + reta4);
	
	
	
	
	
	}

}
