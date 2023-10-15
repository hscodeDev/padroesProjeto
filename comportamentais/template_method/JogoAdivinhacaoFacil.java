package comportamentais.template_method;

import java.util.Scanner;

public class JogoAdivinhacaoFacil extends JogoAdivinhacao {
    private static final int MAX_TENTATIVAS = 5;
    private int numeroPalpite;

    public JogoAdivinhacaoFacil() {
        super();
    }

    @Override
    protected void boasVindas() {
        System.out.println("Bem-vindo ao Jogo de Adivinhação (Versão Difícil)!");
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
        return numeroSecreto == numeroPalpite;
    }

    @Override
    protected void resultadoFinal() {
        if (numeroSecreto == numeroPalpite) {
            System.out.println("Parabéns! Você adivinhou o número.");
        } else {
            System.out.println("Você perdeu. O número secreto era: " + numeroSecreto);
        }
    }
}