package comportamentais.chain_of_responsibility.chain_of_responsibility_dinamico;

public class ManipuladorB implements Handler{
    @Override
    public void processar(String pedido) {
        System.out.println("Manipulador B processando: " + pedido);
    }
}
