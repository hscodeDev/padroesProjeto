package comportamentais.template_method;

import java.util.Random;

public abstract class JogoAdivinhacao {
    protected Random random;
    protected int numeroSecreto;

    public JogoAdivinhacao() {
        random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // Gera um número secreto entre 1 e 100.
    }

    public void jogar() {
        boasVindas();
        while (!adivinhou()) {
            int palpite = obterPalpite();
            if (validarPalpite(palpite)) {
                if (palpite < numeroSecreto) {
                    System.out.println("Tente um número maior.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("Tente um número menor.");
                }
            } else {
                System.out.println("Palpite inválido. Tente novamente.");
            }
        }
        resultadoFinal();
    }

    protected abstract void boasVindas();
    protected abstract int obterPalpite();
    protected abstract boolean validarPalpite(int palpite);
    protected abstract boolean adivinhou();
    protected abstract void resultadoFinal();
}
