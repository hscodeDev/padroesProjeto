package comportamentais.visitor;

public class CalculadoraAreaCircunferencia implements Visitor {
    @Override
    public void visitarCirculo(Circulo circulo) {
        double area = Math.PI * circulo.raio * circulo.raio;
        double circunferencia = 2 * Math.PI * circulo.raio;
        System.out.println("Círculo - Área: " + area + ", Circunferência: " + circunferencia);
    }

    @Override
    public void visitarQuadrado(Quadrado quadrado) {
        double area = quadrado.lado * quadrado.lado;
        System.out.println("Quadrado - Área: " + area);
    }

    @Override
    public void visitarTriangulo(Triangulo triangulo) {
        double area = 0.5 * triangulo.base * triangulo.altura;
        System.out.println("Triângulo - Área: " + area);
    }
}
