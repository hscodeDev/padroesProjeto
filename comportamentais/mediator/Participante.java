package comportamentais.mediator;

public abstract class Participante {
    protected Mediador mediador;
    protected String nome;

    public Participante(Mediador mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
    }

    public abstract void enviarMensagem(String mensagem);

    public abstract void receberMensagem(String mensagem);
}
