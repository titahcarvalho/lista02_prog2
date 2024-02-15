package prog2_lista2;
import java.util.ArrayList;
public class Main_Cartao {

	public static void main(String[] args) {
		ArrayList <CartaoWeb> carta = new ArrayList<CartaoWeb>();
		CartaoWeb Maria = new DiaDosNamorados("Maria","Maria");
		CartaoWeb Joao = new Natal("João", "João");
		CartaoWeb Jose = new Aniversario("José", "José");
		
		carta.add(Maria);
		carta.add(Jose);
		carta.add(Joao);
		
		for( CartaoWeb c: carta) {
			c.showMessage();	
		}

	}

}
