package estruturais.bridge.codigosemaplicar;

public class Barco extends Veiculo {
    private String modoDirecao;

    public Barco(String modoDirecao) {
        this.modoDirecao = modoDirecao;
    }

    @Override
    void acelerar() {
        System.out.println("Barco acelerando em modo " + modoDirecao);
    }

    @Override
    void frear() {
        System.out.println("Barco freando em modo " + modoDirecao);
    }
}
