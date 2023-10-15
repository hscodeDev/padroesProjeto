package criacionais.prototype.prototype;

public class CartaoSaudacao implements Cloneable {
    private String imagem;
    private String mensagem;

    public CartaoSaudacao(String imagem, String mensagem) {
        this.imagem = imagem;
        this.mensagem = mensagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void exibirCartao() {
        System.out.println("Imagem: " + imagem);
        System.out.println("Mensagem: " + mensagem);
    }

    @Override
    public CartaoSaudacao clone() throws CloneNotSupportedException {
        return (CartaoSaudacao) super.clone();
    }
}
