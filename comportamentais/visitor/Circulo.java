package comportamentais.visitor;

public class Circulo extends Forma {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    void aceitar(Visitor visitante) {
        visitante.visitarCirculo(this);
    }
}