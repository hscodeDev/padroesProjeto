package comportamentais.visitor.codigo_sem_aplicar;

public class Circulo extends Forma{
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}