package comportamentais.chain_of_responsibility.chain_of_responsibility_com_prioridades;

public class ManipuladorA implements Handler{
    @Override
    public void processar(String pedido) {
        System.out.println("Manipulador A processando: " + pedido);
    }

    @Override
    public int getPrioridade() {
        return 2;
    }
}
