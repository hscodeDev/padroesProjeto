package comportamentais.state;

public class EstadoDescarregado implements EstadoCarro{
    public void ligar() {
        System.out.println("Não é possível ligar o carro, a bateria está descarregada.");
    }

    public void desligar() {
        System.out.println("O carro já está desligado.");
    }

    public void carregar() {
        System.out.println("Iniciando o processo de carregamento...");
    }
}