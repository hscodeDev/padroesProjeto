package estruturais.bridge.codigosemaplicar;

public class Main {
    public static void main(String[] args) {
        // Criar um carro em modo de direcao normal
        Carro carroDirecaoNormal = new Carro("Direcao Normal");
        carroDirecaoNormal.acelerar();
        carroDirecaoNormal.frear();

        // Criar um barco em modo de navegacao
        Barco barcoNavegacao = new Barco("Navegacao");
        barcoNavegacao.acelerar();
        barcoNavegacao.frear();
    }
}
