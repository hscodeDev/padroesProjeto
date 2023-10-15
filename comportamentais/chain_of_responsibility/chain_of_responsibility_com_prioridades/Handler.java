package comportamentais.chain_of_responsibility.chain_of_responsibility_com_prioridades;

public interface Handler {
    void processar(String pedido);
    int getPrioridade();
}
