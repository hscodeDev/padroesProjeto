package comportamentais.chain_of_responsibility.chain_of_responsibility_com_prioridades;

public class ManipuladorC implements Handler{
    @Override
    public void processar(String pedido) {
        System.out.println("Manipulador C processando: " + pedido);
    }

    @Override
    public int getPrioridade() {
        return 3;
    }
}
