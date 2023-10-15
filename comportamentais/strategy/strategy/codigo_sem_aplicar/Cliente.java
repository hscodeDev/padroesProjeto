package comportamentais.strategy.strategy.codigo_sem_aplicar;

public class Cliente {
    private String nome;
    private double descontoFixo;
    private double descontoPercentual;

    public Cliente(String nome, double descontoFixo, double descontoPercentual) {
        this.nome = nome;
        this.descontoFixo = descontoFixo;
        this.descontoPercentual = descontoPercentual;
    }

    public double calcularDesconto(double valorCompra) {
        if (descontoFixo > 0) {
            return descontoFixo;
        } else if (descontoPercentual > 0) {
            return valorCompra * (descontoPercentual / 100);
        } else {
            return 0.0;
        }
    }

    public String getNome() {
        return nome;
    }
}