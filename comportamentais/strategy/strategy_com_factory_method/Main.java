package comportamentais.strategy.strategy_com_factory_method;

public class Main {
    public static void main(String[] args) {
        EstrategiaPagamento estrategia = FabricaPagamento.criarPagamento("Cartao");
        estrategia.realizarPagamento(100.0);
    }
}
