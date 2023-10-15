package criacionais.factorymethod.models;

import criacionais.factorymethod.Produto;

public class Pao implements Produto {
    @Override
    public void preparar() {
        System.out.println("Preparando pão...");
    }
}
