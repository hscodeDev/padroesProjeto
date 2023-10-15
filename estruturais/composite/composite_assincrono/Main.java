package estruturais.composite.composite_assincrono;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 50);
        Produto p2 = new Produto("Produto 2", 30);

        CatalogoAssincrono catalogoAssincrono = new CatalogoAssincrono();
        catalogoAssincrono.adicionarProduto(p1);
        catalogoAssincrono.adicionarProduto(p2);

        try {
            double totalAssincrono = catalogoAssincrono.calcularTotalAssincrono().get();
            System.out.println("Total assíncrono no catálogo: R$" + totalAssincrono);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
