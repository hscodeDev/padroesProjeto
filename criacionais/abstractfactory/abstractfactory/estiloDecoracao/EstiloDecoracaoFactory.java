package criacionais.abstractfactory.abstractfactory.estiloDecoracao;

import criacionais.abstractfactory.abstractfactory.cabeceira.MesaCabeceira;
import criacionais.abstractfactory.abstractfactory.cama.Cama;
import criacionais.abstractfactory.abstractfactory.guardaRoupa.GuardaRoupa;

public interface EstiloDecoracaoFactory {
    Cama criarCama();
    MesaCabeceira criarMesaCabeceira();
    GuardaRoupa criarGuardaRoupa();
}
