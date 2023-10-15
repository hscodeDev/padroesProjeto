package comportamentais.visitor.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(4);
        Triangulo triangulo = new Triangulo(3, 6);

        double areaCirculo = circulo.calcularArea();
        double circunferenciaCirculo = circulo.calcularCircunferencia();

        double areaQuadrado = quadrado.calcularArea();
        double circunferenciaQuadrado = quadrado.calcularCircunferencia();

        double areaTriangulo = triangulo.calcularArea();
        double circunferenciaTriangulo = triangulo.calcularCircunferencia();

        System.out.println("Círculo - Área: " + areaCirculo + ", Circunferência: " + circunferenciaCirculo);
        System.out.println("Quadrado - Área: " + areaQuadrado + ", Circunferência: " + circunferenciaQuadrado);
        System.out.println("Triângulo - Área: " + areaTriangulo + ", Circunferência: " + circunferenciaTriangulo);
    }
}