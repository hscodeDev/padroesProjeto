package estruturais.bridge;

public class Barco extends Veiculo {
    public Barco(ModoDirecao modoDirecao) {
        super(modoDirecao);
    }

    @Override
    void acelerar() {
        System.out.println("Barco acelerando em modo " + modoDirecao.getNomeModo());
    }

    @Override
    void frear() {
        System.out.println("Barco freando em modo " + modoDirecao.getNomeModo());
    }
}
