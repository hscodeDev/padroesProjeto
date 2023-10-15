package comportamentais.template_method.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        JogoAdivinhacaoDificil jogoFacil = new JogoAdivinhacaoDificil();
        JogoAdivinhacaoFacil jogoDificil = new JogoAdivinhacaoFacil();

        System.out.println("Versão Fácil do Jogo:");
        jogoFacil.jogar();

        System.out.println("\nVersão Difícil do Jogo:");
        jogoDificil.jogar();
    }
}