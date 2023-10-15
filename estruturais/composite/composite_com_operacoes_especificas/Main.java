package estruturais.composite.composite_com_operacoes_especificas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 50);
        Produto p2 = new Produto("Produto 2", 30);

        List<Produto> produtosImutaveis = new ArrayList<>();
        produtosImutaveis.add(p1);
        produtosImutaveis.add(p2);
    }
}
