package comportamentais.strategy.strategy_com_factory_method;

public class FabricaPagamento {
    public static EstrategiaPagamento criarPagamento(String tipo) {
        if ("Cartao".equalsIgnoreCase(tipo)) {
            return new PagamentoCartao();
        } else if ("Boleto".equalsIgnoreCase(tipo)) {
            return new PagamentoBoleto();
        } else {
            throw new IllegalArgumentException("Tipo de pagamento inválido.");
        }
    }
}
