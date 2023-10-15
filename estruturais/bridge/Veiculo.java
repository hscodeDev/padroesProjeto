package estruturais.bridge;

public abstract class Veiculo {
    protected ModoDirecao modoDirecao;

    public Veiculo(ModoDirecao modoDirecao) {
        this.modoDirecao = modoDirecao;
    }

    abstract void acelerar();

    abstract void frear();
}