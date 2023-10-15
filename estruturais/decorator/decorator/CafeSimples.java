package estruturais.decorator.decorator;

public class CafeSimples implements Cafe{
    @Override
    public double custo() {
        return 2.0;
    }

    @Override
    public String descricao() {
        return "Café simples";
    }
}
