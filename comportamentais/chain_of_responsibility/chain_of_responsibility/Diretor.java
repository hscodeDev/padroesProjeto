package comportamentais.chain_of_responsibility.chain_of_responsibility;

public class Diretor implements Aprovador {
    @Override
    public void aprovar(int dias) {
        System.out.println("Diretor aprovou as férias.");
    }

    @Override
    public void definirProximoAprovador(Aprovador proximo) {
        // O diretor é o último na cadeia, não tem próximo
    }
}
