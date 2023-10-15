package comportamentais.chain_of_responsibility.chain_of_responsibility_com_padroes_de_filtragem_e_transformacao;

public class RemocaoEspacos implements Handler {
    @Override
    public String processar(String input) {
        return input.replaceAll(" ", "");
    }
}
