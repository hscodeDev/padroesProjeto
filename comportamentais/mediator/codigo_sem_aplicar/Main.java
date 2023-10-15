package comportamentais.mediator.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");
        Usuario usuario3 = new Usuario("Charlie");

        usuario1.enviarMensagem("Olá a todos!", usuario2);
        usuario2.enviarMensagem("Oi, Alice!", usuario1);
        usuario3.enviarMensagem("E aí, pessoal!", usuario1);
    }
}