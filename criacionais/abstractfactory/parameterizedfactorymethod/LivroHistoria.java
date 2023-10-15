package criacionais.abstractfactory.parameterizedfactorymethod;

import criacionais.abstractfactory.Livro;

import javax.sound.sampled.Line;

public class LivroHistoria extends Livro {
    public LivroHistoria(String titulo) {
        super(titulo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro de história: " + titulo);
    }
}
