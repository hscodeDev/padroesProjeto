package comportamentais.command.command.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        // Ligar a lâmpada diretamente
        lampada.ligar();

        // Desligar a lâmpada diretamente
        lampada.desligar();
    }
}
