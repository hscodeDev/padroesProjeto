package criacionais.builder.builderfluent;

import criacionais.builder.Casa;

public class CasaBuilderFluent {
    private Casa casa = new Casa();

    public CasaBuilderFluent comEstrutura(String estrutura) {
        casa.setEstrutura(estrutura);
        return this;
    }

    public CasaBuilderFluent comTelhado(String telhado) {
        casa.setTelhado(telhado);
        return this;
    }

    public CasaBuilderFluent comParedes(String paredes) {
        casa.setParedes(paredes);
        return this;
    }

    public Casa construir() {
        return casa;
    }
}
