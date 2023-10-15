package comportamentais.state.codigo_sem_aplicar;

public class Carro {
    private boolean descarregado;
    private boolean carregando;
    private boolean totalmenteCarregado;

    public Carro() {
        descarregado = true;
        carregando = false;
        totalmenteCarregado = false;
    }

    public void ligar() {
        if (descarregado) {
            System.out.println("Não é possível ligar o carro, a bateria está descarregada.");
        } else if (carregando) {
            System.out.println("O carro não pode ser ligado enquanto estiver carregando.");
        } else if (totalmenteCarregado) {
            System.out.println("Ligando o carro...");
        }
    }

    public void desligar() {
        System.out.println("Desligando o carro...");
    }

    public void carregar() {
        if (descarregado) {
            System.out.println("Iniciando o processo de carregamento...");
            carregando = true;
            descarregado = false;
            totalmenteCarregado = false;
        } else if (carregando) {
            System.out.println("O carro já está carregando.");
        } else if (totalmenteCarregado) {
            System.out.println("A bateria já está totalmente carregada.");
        }
    }
}