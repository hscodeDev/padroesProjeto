package estruturais.decorator.decorator;

public class CremeDecorator implements Cafe {
    private final Cafe cafeDecorado;

    public CremeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public double custo() {
        return cafeDecorado.custo() + 0.5;
    }

    @Override
    public String descricao() {
        return cafeDecorado.descricao() + ", com creme";
    }
}
