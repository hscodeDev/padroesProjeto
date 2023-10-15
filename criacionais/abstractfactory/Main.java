package criacionais.abstractfactory;

import criacionais.abstractfactory.dependentAbstractfactory.FabricaLivroDependente;
import criacionais.abstractfactory.dependentAbstractfactory.FabricaLivroDependenteImpl;
import criacionais.abstractfactory.parameterizedfactorymethod.FabricaLivroParametrizado;
import criacionais.abstractfactory.parameterizedfactorymethod.FabricaLivroParametrizadoImpl;
import criacionais.abstractfactory.staticfactorymethod.FabricaLivroEstatico;

public class Main {
    public static void main(String[] args) {

        // Dependent Abstract Factory
        FabricaLivroDependente fabricaDependente = new FabricaLivroDependenteImpl();
        Livro livroInfantil = fabricaDependente.criarLivro(true);
        livroInfantil.exibirDetalhes();

        // Parameterized Factory Method
        FabricaLivroParametrizado fabricaParametrizada = new FabricaLivroParametrizadoImpl();
        Livro livroHistoria = fabricaParametrizada.criarLivro("historia");
        livroHistoria.exibirDetalhes();

        // Static Factory Method
        Livro livroAutoajuda = FabricaLivroEstatico.criarLivro("autoajuda");
        livroAutoajuda.exibirDetalhes();
    }
}
