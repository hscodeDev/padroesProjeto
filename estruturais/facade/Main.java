package estruturais.facade;

public class Main {
    public static void main(String[] args) {
        AutomacaoResidencialFacade automacao = new AutomacaoResidencialFacade();

        System.out.println("Ligando a casa:");
        automacao.ligarCasa();

        System.out.println("\nDesligando a casa:");
        automacao.desligarCasa();
    }
}
