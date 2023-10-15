package criacionais.abstractfactory.dependentAbstractfactory;

import criacionais.abstractfactory.Livro;

public class LivroFiccao extends Livro {

    public LivroFiccao(String titulo) {
        super(titulo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro ficção: " + titulo);
    }
}
