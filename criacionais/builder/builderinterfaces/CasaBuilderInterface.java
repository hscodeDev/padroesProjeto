package criacionais.builder.builderinterfaces;

import criacionais.builder.Casa;

public interface CasaBuilderInterface {
    CasaBuilderInterface construirEstrutura();
    CasaBuilderInterface construirTelhado();
    CasaBuilderInterface construirParedes();
    Casa construir();
}