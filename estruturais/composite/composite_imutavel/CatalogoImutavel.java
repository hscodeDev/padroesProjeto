package estruturais.composite.composite_imutavel;

import java.util.ArrayList;
import java.util.List;

final class CatalogoImutavel {
    private final List<Produto> produtos;

    public CatalogoImutavel(List<Produto> produtos) {
        this.produtos = new ArrayList<>(produtos);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}