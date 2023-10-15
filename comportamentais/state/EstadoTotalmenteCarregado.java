package comportamentais.state;

public class EstadoTotalmenteCarregado implements EstadoCarro{
    public void ligar() {
        System.out.println("Ligando o carro...");
    }

    public void desligar() {
        System.out.println("Desligando o carro...");
    }

    public void carregar() {
        System.out.println("A bateria já está totalmente carregada.");
    }
}