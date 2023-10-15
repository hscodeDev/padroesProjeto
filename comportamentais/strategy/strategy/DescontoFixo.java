package comportamentais.strategy.strategy;

public class DescontoFixo implements CalculadoraDesconto {
    private double valorDesconto;

    public DescontoFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double calcularDesconto(double valorCompra) {
        return valorDesconto;
    }
}