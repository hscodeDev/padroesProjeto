package estruturais.proxy;

public class ConteudoAdulto implements AcessoConteudo{
    @Override
    public void acessar() {
        System.out.println("Acesso ao conteúdo adulto concedido.");
    }
}