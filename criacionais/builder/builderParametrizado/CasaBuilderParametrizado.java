package criacionais.builder.builderParametrizado;

import criacionais.builder.Casa;

public class CasaBuilderParametrizado {
    private String estrutura;
    private String telhado;
    private String paredes;

    public CasaBuilderParametrizado(String estrutura, String telhado) {
        this.estrutura = estrutura;
        this.telhado = telhado;
    }

    public CasaBuilderParametrizado comParedes(String paredes) {
        this.paredes = paredes;
        return this;
    }

    public Casa construir() {
        Casa casa = new Casa();
        casa.setEstrutura(estrutura);
        casa.setTelhado(telhado);
        casa.setParedes(paredes);
        return casa;
    }
}
