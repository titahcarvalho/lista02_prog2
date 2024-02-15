package prog2_lista2;

public class NumeroMain {

	public static void main(String[] args) {
		NumeroComplexo calcula1 = new NumeroComplexo(1,2);
		NumeroComplexo calcula2 = new NumeroComplexo(3,4);
		NumeroComplexo calcula3 = new NumeroComplexo(5,6);
		
		System.out.println("Calcula1: " + calcula1.getReal() + " + " + calcula1.getImaginario() + "i");
		System.out.println("Calcula2: " + calcula2.getReal() + " + " + calcula2.getImaginario() + "i");
		System.out.println("Calcula3: " + calcula3.getReal() + " + " + calcula3.getImaginario() + "i");

		
	
	}

}
