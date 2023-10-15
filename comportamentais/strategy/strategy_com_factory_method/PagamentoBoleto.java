package comportamentais.strategy.strategy_com_factory_method;

public class PagamentoBoleto implements EstrategiaPagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com boleto.");
    }
}