package comportamentais.template_method;

public class Main {
    public static void main(String[] args) {
        JogoAdivinhacao jogoFacil = new JogoAdivinhacaoDificil();
        JogoAdivinhacao jogoDificil = new JogoAdivinhacaoFacil();

        System.out.println("Versão Fácil do Jogo:");
        jogoFacil.jogar();

        System.out.println("\nVersão Difícil do Jogo:");
        jogoDificil.jogar();
    }
}