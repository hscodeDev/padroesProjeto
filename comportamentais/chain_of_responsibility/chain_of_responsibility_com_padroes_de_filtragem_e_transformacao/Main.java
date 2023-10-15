package comportamentais.chain_of_responsibility.chain_of_responsibility_com_padroes_de_filtragem_e_transformacao;

public class Main {
    public static void main(String[] args) {
        String texto = "Isso é um exemplo";

        Handler transformador = new TransformacaoParaMaiusculas();
        Handler removedorEspacos = new RemocaoEspacos();

        String resultado = transformador.processar(texto);
        resultado = removedorEspacos.processar(resultado);

        System.out.println("Resultado: " + resultado);
    }
}
