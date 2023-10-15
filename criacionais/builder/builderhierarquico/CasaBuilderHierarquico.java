package criacionais.builder.builderhierarquico;

import criacionais.builder.Casa;

public class CasaBuilderHierarquico {
    private Casa casa = new Casa();

    public CasaBuilderHierarquico construirEstrutura() {
        casa.setEstrutura("Tijolos e Concreto");
        return this;
    }

    public CasaBuilderHierarquico construirTelhado() {
        casa.setTelhado("Telhas de Barro");
        return this;
    }

    public CasaBuilderHierarquico construirParedes() {
        casa.setParedes("Pintura Branca");
        return this;
    }

    public Casa construir() {
        return casa;
    }
}
