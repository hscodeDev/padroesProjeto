package estruturais.proxy;

public class Main {
    public static void main(String[] args) {
        AcessoConteudo proxy = new ProxyAcessoConteudo(18);

        proxy.acessar();
    }
}