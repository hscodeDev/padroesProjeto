package comportamentais.chain_of_responsibility.chain_of_responsibility_hierarquico;

public class ManipuladorBase implements Handler {
    private Handler proximo;

    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(String pedido) {
        if (proximo != null) {
            proximo.processar(pedido);
        }
    }
}
