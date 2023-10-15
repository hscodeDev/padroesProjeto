package criacionais.builder.builder;

public interface CasaBuilder {
    void construirNumeroQuartos(int numeroQuartos);

    void construirTipoTelhado(String tipoTelhado);

    void construirCorParedes(String corParedes);

    Casa obterCasa();
}
