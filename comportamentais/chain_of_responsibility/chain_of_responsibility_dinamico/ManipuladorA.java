package comportamentais.chain_of_responsibility.chain_of_responsibility_dinamico;

public class ManipuladorA implements Handler{
    @Override
    public void processar(String pedido) {
        System.out.println("Manipulador A processando: " + pedido);
    }
}
