package criacionais.builder.builderinterfaces;

import criacionais.builder.Casa;

public class CasaBuilder implements CasaBuilderInterface {
    private Casa casa = new Casa();

    @Override
    public CasaBuilderInterface construirEstrutura() {
        casa.setEstrutura("Alvenaria");
        return this;
    }

    @Override
    public CasaBuilderInterface construirTelhado() {
        casa.setTelhado("Telhado de Fibrocimento");
        return this;
    }

    @Override
    public CasaBuilderInterface construirParedes() {
        casa.setParedes("Pintura Amarela");
        return this;
    }

    @Override
    public Casa construir() {
        return casa;
    }
}
