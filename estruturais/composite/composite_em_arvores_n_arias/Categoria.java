package estruturais.composite.composite_em_arvores_n_arias;

import java.util.ArrayList;
import java.util.List;

class Categoria {
    private String nome;
    private List<Produto> produtos = new ArrayList<>();
    private List<Categoria> subcategorias = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarSubcategoria(Categoria subcategoria) {
        subcategorias.add(subcategoria);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        for (Categoria subcategoria : subcategorias) {
            total += subcategoria.calcularTotal();
        }
        return total;
    }
}

