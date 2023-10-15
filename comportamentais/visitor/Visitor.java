package comportamentais.visitor;

public interface Visitor {
    void visitarCirculo(Circulo circulo);
    void visitarQuadrado(Quadrado quadrado);
    void visitarTriangulo(Triangulo triangulo);
}