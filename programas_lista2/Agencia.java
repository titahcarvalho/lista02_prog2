package prog2_lista2;
import java.util.ArrayList;

public class Agencia {
    private ArrayList<ContaBancaria> contas;
    private double quantMax;
    
    public Agencia(double quantMax) {
        this.contas = new ArrayList<>();
        this.quantMax = quantMax;
    }

    public void addConta(ContaBancaria novaConta) {
        if (contas.size() < quantMax) {
            contas.add(novaConta);
            System.out.println("Conta adicionada com sucesso!");
        } else {
            System.out.println("Limite de contas alcançado");
        }
    }

    public double montanteContaCorrente() {
        double montante = 0;
        for (ContaBancaria conta : contas) {
            if (conta instanceof ContaCorrente) {
                ContaCorrente contaCorrente = (ContaCorrente) conta;
                montante += contaCorrente.getSaldo();
            }
        }
        return montante;
    }

    public double montanteContaPoupanca() {
        double montante = 0;
        for (ContaBancaria conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
                montante += contaPoupanca.getSaldo();
            }
        }
        return montante;
    }

    public void imprimeContas() {
        System.out.println("Imprimir contas...");
    }
}
