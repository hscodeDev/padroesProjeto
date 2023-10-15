package criacionais.factorymethod.genericfactorymethod;

import criacionais.factorymethod.Produto;

public class Padaria {
    public <T extends Produto> T criarProduto(Class<T> produtoClass) throws IllegalAccessException, InstantiationException {
        return produtoClass.newInstance();
    }
}
