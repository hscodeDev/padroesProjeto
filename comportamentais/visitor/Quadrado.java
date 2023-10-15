package comportamentais.visitor;

public class Quadrado extends Forma {
    double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    void aceitar(Visitor visitante) {
        visitante.visitarQuadrado(this);
    }
}