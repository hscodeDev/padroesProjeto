package estruturais.bridge;

public class Main {
    public static void main(String[] args) {
        // Criar um carro em modo de direcao normal
        Veiculo carroDirecaoNormal = new Carro(new DirecaoNormal());
        carroDirecaoNormal.acelerar();
        carroDirecaoNormal.frear();

        // Criar um barco em modo de navegacao
        Veiculo barcoNavegacao = new Barco(new Navegacao());
        barcoNavegacao.acelerar();
        barcoNavegacao.frear();
    }
}