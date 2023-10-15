package criacionais.abstractfactory.parameterizedfactorymethod;

import criacionais.abstractfactory.Livro;
import criacionais.abstractfactory.dependentAbstractfactory.LivroFiccao;

public class FabricaLivroParametrizadoImpl implements FabricaLivroParametrizado {

    @Override
    public Livro criarLivro(String tipo) {
        if ("ficcao".equalsIgnoreCase(tipo)) {
            return new LivroFiccao("Mundos Fantásticos");
        } else if ("historia".equalsIgnoreCase(tipo)) {
            return new LivroHistoria("Grandes Civilizações");
        }
        return null;
    }
}
