package criacionais.prototype.prototype;

public class Main {
    public static void main(String[] args) {
        CartaoSaudacao prototype = new CartaoSaudacao("imagem_padrao.png", "Feliz Aniversário");

        try {
            CartaoSaudacao cartao1 = prototype.clone();
            cartao1.setMensagem("Parabéns pelo seu dia!");

            CartaoSaudacao cartao2 = prototype.clone();
            cartao2.setImagem("outra_imagem.png");
            cartao2.setMensagem("Desejando um dia Especial!");

            // Exibindo os cartões criados
            cartao1.exibirCartao();
            System.out.println("----------------------");
            cartao2.exibirCartao();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

       // Código sem Aplicar
        CartaoSaudacao cartao1 = new CartaoSaudacao("imagem_padrao.png", "Feliz aniversário!");
        cartao1.exibirCartao();

        System.out.println("----------------------");

        CartaoSaudacao cartao2 = new CartaoSaudacao("outra_imagem.png", "Desejando um dia especial!");
        cartao2.exibirCartao();
    }
}
