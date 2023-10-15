package estruturais.proxy;

public class ProxyAcessoConteudo implements AcessoConteudo {
    private AcessoConteudo conteudoReal;
    private int idadeMinima;

    public ProxyAcessoConteudo(int idadeMinima) {
        this.idadeMinima = idadeMinima;
        this.conteudoReal = new ConteudoAdulto();
    }

    @Override
    public void acessar() {
        if (verificarIdade()) {
            conteudoReal.acessar();
        } else {
            System.out.println("Você não tem idade suficiente para acessar o conteúdo adulto.");
        }
    }

    private boolean verificarIdade() {
        int idadeDoUsuario = 21;
        return idadeDoUsuario >= idadeMinima;
    }
}