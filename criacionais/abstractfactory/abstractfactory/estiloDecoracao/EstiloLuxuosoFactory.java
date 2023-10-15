package criacionais.abstractfactory.abstractfactory.estiloDecoracao;

import criacionais.abstractfactory.abstractfactory.cabeceira.MesaCabeceira;
import criacionais.abstractfactory.abstractfactory.cabeceira.MesaCabeceiraLuxuosa;
import criacionais.abstractfactory.abstractfactory.cama.Cama;
import criacionais.abstractfactory.abstractfactory.cama.CamaLuxuosa;
import criacionais.abstractfactory.abstractfactory.guardaRoupa.GuardaRoupa;
import criacionais.abstractfactory.abstractfactory.guardaRoupa.GuardaRoupaLuxuoso;

public class EstiloLuxuosoFactory implements EstiloDecoracaoFactory {
    @Override
    public Cama criarCama() {
        return new CamaLuxuosa();
    }

    @Override
    public MesaCabeceira criarMesaCabeceira() {
        return new MesaCabeceiraLuxuosa();
    }

    @Override
    public GuardaRoupa criarGuardaRoupa() {
        return new GuardaRoupaLuxuoso();
    }
}
