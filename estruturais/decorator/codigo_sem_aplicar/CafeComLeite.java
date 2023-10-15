package estruturais.decorator.codigo_sem_aplicar;

public class CafeComLeite extends CafeBase{
    @Override
    public double custo() {
        return super.custo() + 1.0; // Preço do café com leite
    }

    @Override
    public String descricao() {
        return "Café com leite";
    }
}
