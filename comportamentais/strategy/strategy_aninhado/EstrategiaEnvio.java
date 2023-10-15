package comportamentais.strategy.strategy_aninhado;

public class EstrategiaEnvio {
    private EstrategiaTaxaEnvio taxaEnvio;

    public EstrategiaEnvio(EstrategiaTaxaEnvio taxaEnvio) {
        this.taxaEnvio = taxaEnvio;
    }

    public double calcularTaxa(int distancia) {
        return taxaEnvio.calcularTaxaEnvio(distancia);
    }
}
