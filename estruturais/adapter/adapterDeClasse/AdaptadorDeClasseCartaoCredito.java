package estruturais.adapter.adapterDeClasse;

import estruturais.adapter.CartaoCredito;
import estruturais.adapter.Pagamento;

public class AdaptadorDeClasseCartaoCredito extends CartaoCredito implements Pagamento {
    @Override
    public void pagarEmDinheiro(double valor) {
        System.out.println("Realizando pagamento com cartão de crédito: R$" + valor);
        pagarComCartao(valor);
    }
}
