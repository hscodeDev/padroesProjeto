package criacionais.builder.builderfuncional;

import criacionais.builder.Casa;

import java.util.function.Function;

public class CasaBuilderFuncional {
    private Function<Casa, Casa> estrutura = c -> {
        c.setEstrutura("Concreto Armado");
        return c;
    };
    private Function<Casa, Casa> telhado = c -> {
        c.setTelhado("Telhas de Cerâmica");
        return c;
    };
    private Function<Casa, Casa> paredes = c -> {
        c.setParedes("Pintura Bege");
        return c;
    };

    public CasaBuilderFuncional comEstrutura(Function<Casa, Casa> fn) {
        this.estrutura = fn;
        return this;
    }

    public CasaBuilderFuncional comTelhado(Function<Casa, Casa> fn) {
        this.telhado = fn;
        return this;
    }

    public CasaBuilderFuncional comParedes(Function<Casa, Casa> fn) {
        this.paredes = fn;
        return this;
    }

    public Casa construir() {
        Casa casa = new Casa();
        casa = this.estrutura.apply(casa);
        casa = this.telhado.apply(casa);
        casa = this.paredes.apply(casa);
        return casa;
    }
}