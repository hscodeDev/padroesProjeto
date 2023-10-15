package criacionais.abstractfactory.abstractfactory;

import criacionais.abstractfactory.abstractfactory.cabeceira.MesaCabeceira;
import criacionais.abstractfactory.abstractfactory.cama.Cama;
import criacionais.abstractfactory.abstractfactory.estiloDecoracao.EstiloDecoracaoFactory;
import criacionais.abstractfactory.abstractfactory.guardaRoupa.GuardaRoupa;

public class DecoradorQuarto {
    private Cama cama;
    private MesaCabeceira mesaCabeceira;
    private GuardaRoupa guardaRoupa;

    public DecoradorQuarto(EstiloDecoracaoFactory estiloDecoracaoFactory){
        this.cama = estiloDecoracaoFactory.criarCama();
        this.mesaCabeceira = estiloDecoracaoFactory.criarMesaCabeceira();
        this.guardaRoupa = estiloDecoracaoFactory.criarGuardaRoupa();
    }

    public void mostarMobilia(){
        System.out.println("Mobília do quarto:");
        System.out.println("Cama: "+ this.cama.getEstilo());
        System.out.println("Mesa de cabeceira: "+ this.mesaCabeceira.getEstilo());
        System.out.println("Guarda Roupa: "+ this.guardaRoupa.getEstilo());
    }
}
