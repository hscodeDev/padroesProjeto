package criacionais.singleton.lazyInitialization;

public class RestauranteLazy {
    private static RestauranteLazy instancia = null;
    private String nome;

    public RestauranteLazy(String nome) {
        this.nome = nome;
    }

    public static RestauranteLazy getInstancia(){
        if(instancia == null){
            instancia = new RestauranteLazy("Restaurante Delícia");
        }
        return instancia;
    }

    public String getNome(){
        return nome;
    }
}
