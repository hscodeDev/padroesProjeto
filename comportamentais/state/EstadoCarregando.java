package comportamentais.state;

public class EstadoCarregando implements EstadoCarro{
    public void ligar() {
        System.out.println("O carro não pode ser ligado enquanto estiver carregando.");
    }

    public void desligar() {
        System.out.println("Desligando o carro durante o carregamento...");
    }

    public void carregar() {
        System.out.println("O carro já está carregando.");
    }
}