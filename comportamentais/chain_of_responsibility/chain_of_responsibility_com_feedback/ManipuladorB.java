package comportamentais.chain_of_responsibility.chain_of_responsibility_com_feedback;

public class ManipuladorB implements Handler{
    @Override
    public String processar(String pedido) {
        String resultado = "Manipulador B processando: " + pedido;
        System.out.println(resultado);
        return resultado;
    }
}
