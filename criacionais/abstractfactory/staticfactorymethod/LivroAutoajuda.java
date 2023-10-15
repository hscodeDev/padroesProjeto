package criacionais.abstractfactory.staticfactorymethod;

import criacionais.abstractfactory.Livro;

public class LivroAutoajuda extends Livro {
    public LivroAutoajuda(String titulo) {
        super(titulo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro de autoajuda: " + titulo);
    }
}
