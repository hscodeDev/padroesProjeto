package criacionais.abstractfactory.dependentAbstractfactory;

import criacionais.abstractfactory.Livro;

public class FabricaLivroDependenteImpl implements FabricaLivroDependente {
    @Override
    public Livro criarLivro(boolean livroInfantil) {
        if (livroInfantil) {
            return new LivroInfantil("Aventuras Coloridas");
        } else {
            return new LivroFiccao("Jornada Épica");
        }
    }
}
