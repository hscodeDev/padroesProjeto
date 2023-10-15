package estruturais.composite.composite_com_heranca;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 50);
        Produto p2 = new Produto("Produto 2", 30);

        Produto produtoImportado = new ProdutoImportado("Produto Importado", 100, 10);
        System.out.println("Preço do Produto Importado: R$" + produtoImportado.getPreco());

    }
}
