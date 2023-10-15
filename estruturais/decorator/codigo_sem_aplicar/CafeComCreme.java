package estruturais.decorator.codigo_sem_aplicar;

public class CafeComCreme extends CafeBase{
    @Override
    public double custo() {
        return super.custo() + 0.5;
    }

    @Override
    public String descricao() {
        return "Café com creme";
    }
}
