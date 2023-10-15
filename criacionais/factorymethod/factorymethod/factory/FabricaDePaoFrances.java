package criacionais.factorymethod.factorymethod.factory;

import criacionais.factorymethod.factorymethod.models.Pao;
import criacionais.factorymethod.factorymethod.models.PaoFrances;

public class FabricaDePaoFrances implements FabricaDePao{
    @Override
    public Pao criarPao() {
        return new PaoFrances();
    }
}
