package comportamentais.chain_of_responsibility.chain_of_responsibility_hierarquico;

public class ManipuladorA extends ManipuladorBase {
    @Override
    public void processar(String pedido) {
        System.out.println("Manipulador A processando: " + pedido);
        super.processar(pedido);
    }
}
