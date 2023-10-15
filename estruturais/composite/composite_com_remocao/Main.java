package estruturais.composite.composite_com_remocao;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 50);
        Produto p2 = new Produto("Produto 2", 30);

        Catalogo catalogo = new Catalogo();
        catalogo.adicionarProduto(p1);
        catalogo.adicionarProduto(p2);

        System.out.println("Total no catálogo: R$" + catalogo.calcularTotal());

    }
}