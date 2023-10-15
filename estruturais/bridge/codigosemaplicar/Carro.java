package estruturais.bridge.codigosemaplicar;

public class Carro extends Veiculo {
    private String modoDirecao;

    public Carro(String modoDirecao) {
        this.modoDirecao = modoDirecao;
    }

    @Override
    void acelerar() {
        System.out.println("Carro acelerando em modo " + modoDirecao);
    }

    @Override
    void frear() {
        System.out.println("Carro freando em modo " + modoDirecao);
    }
}
