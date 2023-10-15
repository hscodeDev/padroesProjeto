package criacionais.builder.builderassimetrico;

import criacionais.builder.Casa;

public class CasaBuilderAssimetrico {
    private Casa casa = new Casa();

    public CasaBuilderAssimetrico construirEstruturaETelhado(String estrutura, String telhado) {
        casa.setEstrutura(estrutura);
        casa.setTelhado(telhado);
        return this;
    }

    public CasaBuilderAssimetrico construirParedes(String paredes) {
        casa.setParedes(paredes);
        return this;
    }

    public Casa construir() {
        return casa;
    }
}
