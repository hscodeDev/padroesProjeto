package comportamentais.strategy.strategy_aninhado;

public class TaxaExpressa implements EstrategiaTaxaEnvio {
    public double calcularTaxaEnvio(int distancia) {
        return distancia * 0.3;
    }
}