package criacionais.abstractfactory.parameterizedfactorymethod;

import criacionais.abstractfactory.Livro;

public interface FabricaLivroParametrizado {
    Livro criarLivro(String tipo);
}
