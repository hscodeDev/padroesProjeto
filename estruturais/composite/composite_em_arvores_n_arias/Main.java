package estruturais.composite.composite_em_arvores_n_arias;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 50);
        Produto p2 = new Produto("Produto 2", 30);

        Categoria categoriaRaiz = new Categoria("Categoria Raiz");
        Categoria categoria1 = new Categoria("Categoria 1");
        Categoria categoria2 = new Categoria("Categoria 2");

        Produto produtoCategoria1 = new Produto("Produto Categoria 1", 40);
        Produto produtoCategoria2 = new Produto("Produto Categoria 2", 60);

        categoria1.adicionarProduto(produtoCategoria1);
        categoria2.adicionarProduto(produtoCategoria2);

        categoriaRaiz.adicionarSubcategoria(categoria1);
        categoriaRaiz.adicionarSubcategoria(categoria2);

        System.out.println("Total na Categoria Raiz: R$" + categoriaRaiz.calcularTotal());
    }
}
