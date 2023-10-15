package comportamentais.chain_of_responsibility.chain_of_responsibility_com_feedback;

public class ManipuladorA implements Handler{
    @Override
    public String processar(String pedido) {
        String resultado = "Manipulador A processando: " + pedido;
        System.out.println(resultado);
        return resultado;
    }
}
