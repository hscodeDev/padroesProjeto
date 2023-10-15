package criacionais.abstractfactory.dependentAbstractfactory;

import criacionais.abstractfactory.Livro;

public class LivroInfantil extends Livro {
    public LivroInfantil(String titulo) {
        super(titulo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro infantil: " + titulo);
    }
}
