package criacionais.abstractfactory.staticfactorymethod;

import criacionais.abstractfactory.Livro;
import criacionais.abstractfactory.dependentAbstractfactory.LivroFiccao;

public class FabricaLivroEstatico {
    public static Livro criarLivro(String tipo) {
        if ("ficcao".equalsIgnoreCase(tipo)) {
            return new LivroFiccao("Mundos Distópicos");
        } else if ("autoajuda".equalsIgnoreCase(tipo)) {
            return new LivroAutoajuda("Caminho para o Sucesso");
        }
        return null;
    }
}
