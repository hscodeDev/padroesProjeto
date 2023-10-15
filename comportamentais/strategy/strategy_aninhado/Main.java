package comportamentais.strategy.strategy_aninhado;

public class Main {
    public static void main(String[] args) {
        EstrategiaEnvio envioPadrao = new EstrategiaEnvio(new TaxaPadrao());
        EstrategiaEnvio envioExpresso = new EstrategiaEnvio(new TaxaExpressa());

        int distancia = 50;
        System.out.println("Taxa de envio padrão: R$" + envioPadrao.calcularTaxa(distancia));
        System.out.println("Taxa de envio expressa: R$" + envioExpresso.calcularTaxa(distancia));
    }
}
