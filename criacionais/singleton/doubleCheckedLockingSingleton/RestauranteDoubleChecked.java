package criacionais.singleton.doubleCheckedLockingSingleton;

public class RestauranteDoubleChecked {
    private volatile static RestauranteDoubleChecked instancia = null;
    private String nome;

    private RestauranteDoubleChecked(String nome) {
        this.nome = nome;
    }

    public static RestauranteDoubleChecked getInstancia() {
        if (instancia == null) {
            synchronized (RestauranteDoubleChecked.class) {
                if (instancia == null) {
                    instancia = new RestauranteDoubleChecked("Restaurante Moderno");
                }
            }
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }
}
