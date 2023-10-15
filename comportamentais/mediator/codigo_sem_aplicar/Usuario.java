package comportamentais.mediator.codigo_sem_aplicar;

public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void enviarMensagem(String mensagem, Usuario destinatario) {
        System.out.println(nome + " enviou: " + mensagem);
        destinatario.receberMensagem(mensagem);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}