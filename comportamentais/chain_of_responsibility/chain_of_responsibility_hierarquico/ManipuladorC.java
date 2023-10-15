package comportamentais.chain_of_responsibility.chain_of_responsibility_hierarquico;

public class ManipuladorC extends ManipuladorBase {
    @Override
    public void processar(String pedido) {
        System.out.println("Manipulador C processando: " + pedido);
        super.processar(pedido);
    }
}
