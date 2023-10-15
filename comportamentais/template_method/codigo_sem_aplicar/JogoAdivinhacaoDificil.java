package comportamentais.template_method.codigo_sem_aplicar;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoDificil {
    private Random random;
    private int numeroSecreto;
    private int tentativas;
    private static final int MAX_TENTATIVAS = 5;

    public JogoAdivinhacaoDificil() {
        random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // Gera um número secreto entre 1 e 100.
        tentativas = 0;
    }

    public void jogar() {
        System.out.println("Bem-vindo ao Jogo de Adivinhação (Versão Fácil)!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");

        while (tentativas < MAX_TENTATIVAS) {
            int palpite = obterPalpite();
            if (palpite < 1 || palpite > 100) {
                System.out.println("Palpite inválido. Tente novamente.");
                continue;
            }

            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
                return;
            }
        }

        System.out.println("Você esgotou todas as tentativas. O número secreto era: " + numeroSecreto);
    }

    private int obterPalpite() {
        System.out.print("Digite o seu palpite: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
