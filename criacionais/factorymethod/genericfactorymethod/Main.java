package criacionais.factorymethod.genericfactorymethod;

import criacionais.factorymethod.Produto;
import criacionais.factorymethod.models.Bolo;
import criacionais.factorymethod.models.Pao;

public class Main {
    public static void main(String[] args) {
        try {
            Padaria padaria = new Padaria();
            Produto paoGeneric = padaria.criarProduto(Pao.class);
            paoGeneric.preparar();

            Produto boloGeneric = padaria.criarProduto(Bolo.class);
            boloGeneric.preparar();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
