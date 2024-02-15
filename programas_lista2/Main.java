package prog2_lista2;

public class Main {

    public static void main(String[] args) {
        FormaFactory formaFactory = new FormaFactory();
        FormaGeometrica shape1 = formaFactory.getForma("Circulo_P");
        shape1.desenhar();
        
        FormaGeometrica shape2 = formaFactory.getForma("Quadrado_P");
        shape2.desenhar();
        
        FormaGeometrica shape3 = formaFactory.getForma("Triangulo_P");
        shape3.desenhar();
    }
}