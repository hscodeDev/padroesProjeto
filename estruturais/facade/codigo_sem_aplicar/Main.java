package estruturais.facade.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        Luzes luzes = new Luzes();
        Climatizacao climatizacao = new Climatizacao();
        Seguranca seguranca = new Seguranca();

        System.out.println("Ligando a casa:");
        luzes.ligar();
        climatizacao.ligarArCondicionado();
        seguranca.ativarAlarme();

        System.out.println("\nDesligando a casa:");
        luzes.desligar();
        climatizacao.desligarArCondicionado();
        seguranca.desativarAlarme();
    }
}
