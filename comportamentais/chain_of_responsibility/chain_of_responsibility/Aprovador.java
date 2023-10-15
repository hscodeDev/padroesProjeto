package comportamentais.chain_of_responsibility.chain_of_responsibility;

public interface Aprovador {
    void aprovar(int dias);
    void definirProximoAprovador(Aprovador proximo);
}
