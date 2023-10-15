package estruturais.adapter.adapter;

public class Main {
    public static void main(String[] args) {
        ReprodutorDeMusica reprodutor = new AdaptadorDeFlac();
        reprodutor.reproduzir("musica.flac");
    }
}