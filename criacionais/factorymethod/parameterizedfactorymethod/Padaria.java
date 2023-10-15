package criacionais.factorymethod.parameterizedfactorymethod;

import criacionais.factorymethod.Produto;
import criacionais.factorymethod.models.Bolo;
import criacionais.factorymethod.models.Pao;

public class Padaria {
    public Produto criarProduto(String tipo) {
        switch (tipo) {
            case "pao":
                return new Pao();
            case "bolo":
                return new Bolo();
            default:
                throw new IllegalArgumentException("Tipo de produto inválido");
        }
    }
}
