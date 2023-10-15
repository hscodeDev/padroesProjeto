package estruturais.bridge;

public class Carro extends Veiculo {
    public Carro(ModoDirecao modoDirecao) {
        super(modoDirecao);
    }

    @Override
    void acelerar() {
        System.out.println("Carro acelerando em modo " + modoDirecao.getNomeModo());
    }

    @Override
    void frear() {
        System.out.println("Carro freando em modo " + modoDirecao.getNomeModo());
    }
}
