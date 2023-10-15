package comportamentais.template_method;

import java.util.Scanner;

public class JogoAdivinhacaoDificil extends JogoAdivinhacao {
    private int tentativas;
    private static final int MAX_TENTATIVAS = 10;
    private int numeroPalpite;

    public JogoAdivinhacaoDificil() {
        super();
        tentativas = 0;
    }

    @Override
    protected void boasVindas() {
        System.out.println("Bem-vindo ao Jogo de Adivinhação (Versão Fácil)!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");
    }

    @Override
    protected int obterPalpite() {
        System.out.print("Digite o seu palpite: ");
        Scanner scanner = new Scanner(System.in);
        numeroPalpite = scanner.nextInt();
        return numeroPalpite;
    }

    @Override
    protected boolean validarPalpite(int palpite) {
        return palpite >= 1 && palpite <= 100;
    }

    @Override
    protected boolean adivinhou() {
        tentativas++;
        return tentativas >= MAX_TENTATIVAS || numeroSecreto == numeroPalpite;
    }

    @Override
    protected void resultadoFinal() {
        if (numeroSecreto == numeroPalpite) {
            System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
        } else {
            System.out.println("Você esgotou todas as tentativas. O número secreto era: " + numeroSecreto);
        }
    }
}