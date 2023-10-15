package criacionais.abstractfactory.dependentAbstractfactory;

import criacionais.abstractfactory.Livro;

public interface FabricaLivroDependente {
    Livro criarLivro(boolean livroInfantil);
}
