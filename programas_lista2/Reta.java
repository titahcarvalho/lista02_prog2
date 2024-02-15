package prog2_lista2;
import prog2_lista2.Ponto2D;

public class Reta {
    private Ponto2D inicio;
    private Ponto2D fim;
    

    public Reta() {
        this.inicio = new Ponto2D(0, 0);
        this.fim = new Ponto2D(0, 0);
    }

    public Reta(Ponto2D pontofinal) {
        this.inicio = new Ponto2D(0, 0);
        this.fim = pontofinal;
    }

    public Reta(Ponto2D inicio, Ponto2D fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Reta(double inicioX, double inicioY, double fimX, double fimY) {
        this.inicio = new Ponto2D(inicioX, inicioY);
        this.fim = new Ponto2D(fimX, fimY);
    }

    public Ponto2D getInicio() {
        return inicio;
    }

    public void setInicio(Ponto2D inicio) {
        this.inicio = inicio;
    }

    public Ponto2D getFim() {
        return fim;
    }

    public void setFim(Ponto2D fim) {
        this.fim = fim;
    }
}
