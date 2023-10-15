package comportamentais.chain_of_responsibility.chain_of_responsibility_hierarquico;

public class ManipuladorB extends ManipuladorBase{
    @Override
    public void processar(String pedido) {
        System.out.println("Manipulador B processando: " + pedido);
        super.processar(pedido);
    }
}
