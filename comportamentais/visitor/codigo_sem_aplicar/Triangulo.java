package comportamentais.visitor.codigo_sem_aplicar;

public class Triangulo extends Forma {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    double calcularCircunferencia() {
        return 0.0;
    }
}