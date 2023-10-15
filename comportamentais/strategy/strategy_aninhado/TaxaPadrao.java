package comportamentais.strategy.strategy_aninhado;

public class TaxaPadrao implements EstrategiaTaxaEnvio {
    public double calcularTaxaEnvio(int distancia) {
        return distancia * 0.1;
    }
}