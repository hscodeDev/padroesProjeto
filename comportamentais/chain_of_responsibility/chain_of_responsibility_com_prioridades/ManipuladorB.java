package comportamentais.chain_of_responsibility.chain_of_responsibility_com_prioridades;

public class ManipuladorB implements Handler{
    @Override
    public void processar(String pedido) {
        System.out.println("Manipulador B processando: " + pedido);
    }

    @Override
    public int getPrioridade() {
        return 1;
    }
}
