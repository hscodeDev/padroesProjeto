package criacionais.singleton.threadSafeSingleton;

public class RestauranteThreadSafe {
    private static RestauranteThreadSafe instancia = null;
    private String nome;

    private RestauranteThreadSafe(String nome) {
        this.nome = nome;
    }

    public synchronized static RestauranteThreadSafe getInstancia() {
        if (instancia == null) {
            instancia = new RestauranteThreadSafe("Restaurante Elegante");
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }
}
