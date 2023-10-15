package criacionais.singleton.billPughSingleton;

public class RestauranteBillPugh {
    private String nome;

    private RestauranteBillPugh(String nome) {
        this.nome = nome;
    }

    private static class SingletonHelper {
        private static final RestauranteBillPugh instancia = new RestauranteBillPugh("Restaurante Charmoso");
    }

    public static RestauranteBillPugh getInstancia() {
        return SingletonHelper.instancia;
    }

    public String getNome() {
        return nome;
    }
}
