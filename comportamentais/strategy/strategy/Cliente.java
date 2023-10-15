package comportamentais.strategy.strategy;

public class Cliente {
    private String nome;
    private CalculadoraDesconto calculadoraDesconto;

    public Cliente(String nome, CalculadoraDesconto calculadoraDesconto) {
        this.nome = nome;
        this.calculadoraDesconto = calculadoraDesconto;
    }

    public double calcularDesconto(double valorCompra) {
        return calculadoraDesconto.calcularDesconto(valorCompra);
    }

    public String getNome() {
        return nome;
    }
}