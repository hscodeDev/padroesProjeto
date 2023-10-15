package comportamentais.mediator;

public class Usuario extends Participante{
    public Usuario(Mediador mediador, String nome) {
        super(mediador, nome);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
