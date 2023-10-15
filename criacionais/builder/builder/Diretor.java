package criacionais.builder.builder;

public class Diretor {
    public Casa construirCasa(CasaBuilder builder) {
        builder.construirNumeroQuartos(3);
        builder.construirTipoTelhado("Telhado de cerâmica");
        builder.construirCorParedes("Branco");
        return builder.obterCasa();
    }
}
