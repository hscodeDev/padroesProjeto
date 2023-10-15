package criacionais.factorymethod.parameterizedfactorymethod;

import criacionais.factorymethod.Produto;

public class Main {
    public static void main(String[] args) {
        Padaria padaria = new Padaria();

        Produto pao = padaria.criarProduto("pao");
        pao.preparar();

        Produto bolo = padaria.criarProduto("bolo");
        bolo.preparar();
    }
}
