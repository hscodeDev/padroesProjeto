package comportamentais.strategy.strategy;

public class DescontoPercentual implements CalculadoraDesconto {
    private double percentualDesconto;

    public DescontoPercentual(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * (percentualDesconto / 100);
    }
}