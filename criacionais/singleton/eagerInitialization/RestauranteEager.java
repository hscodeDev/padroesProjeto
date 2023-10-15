package criacionais.singleton.eagerInitialization;

import criacionais.singleton.lazyInitialization.RestauranteLazy;

import java.awt.event.WindowStateListener;

public class RestauranteEager {
    private static RestauranteEager instancia = new RestauranteEager("Restaurante Gourmet");
    private String nome;

    public RestauranteEager(String nome) {
        this.nome = nome;
    }

    public static RestauranteEager getInstancia() {
        return instancia;
    }

    public String getNome() {
        return nome;
    }
}
