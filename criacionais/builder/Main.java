package criacionais.builder;

import criacionais.builder.builderParametrizado.CasaBuilderParametrizado;
import criacionais.builder.builderassimetrico.CasaBuilderAssimetrico;
import criacionais.builder.builderfluent.CasaBuilderFluent;
import criacionais.builder.builderfuncional.CasaBuilderFuncional;
import criacionais.builder.builderhierarquico.CasaBuilderHierarquico;
import criacionais.builder.builderinterfaces.CasaBuilder;
import criacionais.builder.builderinterfaces.CasaBuilderInterface;

public class Main {
    public static void main(String[] args) {

        //Builder Hierárquico
        CasaBuilderHierarquico builderHierarquico = new CasaBuilderHierarquico();
        Casa casaHierarquica = builderHierarquico
                .construirEstrutura()
                .construirTelhado()
                .construirParedes()
                .construir();

        System.out.println("Builder Hierárquico: " + casaHierarquica);

        //Builder Fluent
        CasaBuilderFluent builderFluent = new CasaBuilderFluent();
        Casa casaFluent = builderFluent
                .comEstrutura("Concreto Armado")
                .comTelhado("Telhas de Cerâmica")
                .comParedes("Pintura Bege")
                .construir();
        System.out.println("Builder Fluent: " + casaFluent);

        //Builder Funcional
        CasaBuilderFuncional builderFuncional = new CasaBuilderFuncional();
        builderFuncional
                .comEstrutura(casa -> {
                    casa.setEstrutura("Tijolo e Concreto");
                    return casa;
                })
                .comTelhado(casa -> {
                    casa.setTelhado("Telhas de Barro");
                    return casa;
                })
                .comParedes(casa -> {
                    casa.setParedes("Pintura Branca");
                    return casa;
                });
        Casa casaFuncional = builderFuncional.construir();
        System.out.println("Builder Funcional: " + casaFuncional);

        //Builder Assimétrico
        CasaBuilderAssimetrico builderAssimetrico = new CasaBuilderAssimetrico();
        Casa casaAssimetrica = builderAssimetrico
                .construirEstruturaETelhado("Concreto", "Telhas de Fibrocimento")
                .construirParedes("Pintura Cinza")
                .construir();
        System.out.println("Builder Assimétrico: " + casaAssimetrica);

        //Builder Parametrizado
        CasaBuilderParametrizado casaBuilderParametrizado = new CasaBuilderParametrizado("Madeira", "Telhas de madeira")
                .comParedes("Pintura Verde");
        Casa casaParametrizada = casaBuilderParametrizado.construir();
        System.out.println("Builder Parametrizado: " + casaParametrizada);

        //Builder Baseado em Intefaces
        CasaBuilderInterface builderInterface = new CasaBuilder();
        Casa casaInterface = builderInterface
                .construirEstrutura()
                .construirTelhado()
                .construirParedes()
                .construir();

        System.out.println("Builder Baseado em Interface: " + casaInterface);
    }
}
