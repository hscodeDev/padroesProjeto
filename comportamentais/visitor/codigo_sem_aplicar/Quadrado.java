package comportamentais.visitor.codigo_sem_aplicar;

public class Quadrado extends Forma {
    double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    double calcularCircunferencia() {
        return 4 * lado;
    }
}