package criacionais.builder.builder;

public class ConstrutorDeCasa implements CasaBuilder {
    private int numeroQuartos;
    private String tipoTelhado;
    private String corParedes;

    @Override
    public void construirNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    @Override
    public void construirTipoTelhado(String tipoTelhado) {
        this.tipoTelhado = tipoTelhado;
    }

    @Override
    public void construirCorParedes(String corParedes) {
        this.corParedes = corParedes;
    }

    @Override
    public Casa obterCasa() {
        return new Casa(numeroQuartos, tipoTelhado, corParedes);
    }
}
