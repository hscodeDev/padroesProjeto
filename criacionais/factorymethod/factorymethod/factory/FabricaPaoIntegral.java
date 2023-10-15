package criacionais.factorymethod.factorymethod.factory;

import criacionais.factorymethod.factorymethod.models.Pao;
import criacionais.factorymethod.factorymethod.models.PaoIntegral;

public class FabricaPaoIntegral implements FabricaDePao{
    @Override
    public Pao criarPao() {
        return new PaoIntegral();
    }
}
