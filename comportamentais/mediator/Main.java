package comportamentais.mediator;

public class Main {
    public static void main(String[] args) {
        MediadorChat mediadorChat = new MediadorChat();

        Participante usuario1 = new Usuario(mediadorChat, "Alice");
        Participante usuario2 = new Usuario(mediadorChat, "Bob");
        Participante usuario3 = new Usuario(mediadorChat, "Charlie");

        mediadorChat.adicionarParticipante(usuario1);
        mediadorChat.adicionarParticipante(usuario2);
        mediadorChat.adicionarParticipante(usuario3);

        usuario1.enviarMensagem("Olá a todos!");
        usuario2.enviarMensagem("Oi, Alice!");
        usuario3.enviarMensagem("E aí, pessoal?");
    }
}