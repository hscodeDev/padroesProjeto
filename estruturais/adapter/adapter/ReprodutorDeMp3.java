package estruturais.adapter.adapter;

public class ReprodutorDeMp3 implements ReprodutorDeMusica{
    @Override
    public void reproduzir(String arquivo) {
        System.out.println("Reproduzindo arquivo MP3: " + arquivo);
    }
}
