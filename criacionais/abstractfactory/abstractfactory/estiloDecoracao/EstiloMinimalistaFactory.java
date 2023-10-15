package criacionais.abstractfactory.abstractfactory.estiloDecoracao;

import criacionais.abstractfactory.abstractfactory.cabeceira.MesaCabeceira;
import criacionais.abstractfactory.abstractfactory.cabeceira.MesaCabeceiraMinimalista;
import criacionais.abstractfactory.abstractfactory.cama.Cama;
import criacionais.abstractfactory.abstractfactory.cama.CamaMinimalista;
import criacionais.abstractfactory.abstractfactory.guardaRoupa.GuardaRoupa;
import criacionais.abstractfactory.abstractfactory.guardaRoupa.GuardaRoupaMinimalista;

public class EstiloMinimalistaFactory implements EstiloDecoracaoFactory {
    @Override
    public Cama criarCama() {
        return new CamaMinimalista();
    }

    @Override
    public MesaCabeceira criarMesaCabeceira() {
        return new MesaCabeceiraMinimalista();
    }

    @Override
    public GuardaRoupa criarGuardaRoupa() {
        return new GuardaRoupaMinimalista();
    }
}
