package estruturais.adapter.adapter;

public class AdaptadorDeFlac implements ReprodutorDeMusica {
    private ReprodutorDeMusica reprodutorDeMP3;

    public AdaptadorDeFlac() {
        this.reprodutorDeMP3 = new ReprodutorDeMp3();
    }

    @Override
    public void reproduzir(String arquivo) {
        String arquivoMP3 = converterFLACParaMP3(arquivo);
        reprodutorDeMP3.reproduzir(arquivoMP3);
    }

    private String converterFLACParaMP3(String arquivoFLAC) {
        System.out.println("Convertendo arquivo FLAC para MP3: " + arquivoFLAC);
        return arquivoFLAC.replace(".flac", ".mp3");
    }
}
