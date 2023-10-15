package estruturais.decorator.decorator;

public class LeiteDecorator implements Cafe {
    private final Cafe cafeDecorado;

    public LeiteDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public double custo() {
        return cafeDecorado.custo() + 1.0;
    }

    @Override
    public String descricao() {
        return cafeDecorado.descricao() + ", com leite";
    }
}