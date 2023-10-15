package comportamentais.visitor;

public class Main {
    public static void main(String[] args) {
        BibliotecaFormas biblioteca = new BibliotecaFormas();

        biblioteca.adicionarForma(new Circulo(5));
        biblioteca.adicionarForma(new Quadrado(4));
        biblioteca.adicionarForma(new Triangulo(3, 6));

        Visitor calculadora = new CalculadoraAreaCircunferencia();

        biblioteca.calcularAreasECircunferencias(calculadora);
    }
}
