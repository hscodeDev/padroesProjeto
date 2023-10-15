package comportamentais.visitor;

public class Triangulo extends Forma {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    void aceitar(Visitor visitante) {
        visitante.visitarTriangulo(this);
    }
}