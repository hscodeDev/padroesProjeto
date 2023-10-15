package criacionais.factorymethod.factorymethod.factory;

import criacionais.factorymethod.factorymethod.models.Pao;
import criacionais.factorymethod.factorymethod.models.PaoCenteio;

public class FabricaPaoCenteio implements FabricaDePao{
    @Override
    public Pao criarPao() {
        return new PaoCenteio();
    }
}
