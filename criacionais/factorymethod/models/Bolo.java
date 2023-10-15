package criacionais.factorymethod.models;

import criacionais.factorymethod.Produto;

public class Bolo implements Produto {
    @Override
    public void preparar() {
        System.out.println("Preparando bolo...");
    }
}
