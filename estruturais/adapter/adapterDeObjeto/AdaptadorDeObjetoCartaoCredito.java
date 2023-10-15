package estruturais.adapter.adapterDeObjeto;

import estruturais.adapter.CartaoCredito;
import estruturais.adapter.Pagamento;

public class AdaptadorDeObjetoCartaoCredito implements Pagamento {
    private CartaoCredito cartaoCredito = new CartaoCredito();

    @Override
    public void pagarEmDinheiro(double valor) {
        System.out.println("Realizando pagamento com cartão de crédito: R$" + valor);
        cartaoCredito.pagarComCartao(valor);
    }
}
