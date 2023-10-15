package estruturais.adapter.adapter.codigosemaplicar;

public class Main {
    public static void main(String[] args) {
        ReprodutorDeMp3 reprodutor = new ReprodutorDeMp3();

        // Tente reproduzir um arquivo MP3 (funciona bem)
        reprodutor.reproduzirMP3("musica.mp3");

        // Tente reproduzir um arquivo FLAC (não suportado pelo sistema)
        // Isso geraria um problema, pois o sistema só entende MP3.
        // reprodutor.reproduzirMP3("musica.flac"); // Isso não funcionaria!
    }
}
