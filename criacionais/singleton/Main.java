package criacionais.singleton;

import criacionais.singleton.billPughSingleton.RestauranteBillPugh;
import criacionais.singleton.doubleCheckedLockingSingleton.RestauranteDoubleChecked;
import criacionais.singleton.eagerInitialization.RestauranteEager;
import criacionais.singleton.enumSingleton.RestauranteEnum;
import criacionais.singleton.lazyInitialization.RestauranteLazy;
import criacionais.singleton.threadSafeSingleton.RestauranteThreadSafe;

public class Main {
    public static void main(String[] args) {
        // Lazy Initialization
        RestauranteLazy restauranteLazy = RestauranteLazy.getInstancia();
        System.out.println("Restaurante Lazy: " + restauranteLazy.getNome());

        // Eager Initialization
        RestauranteEager restauranteEager = RestauranteEager.getInstancia();
        System.out.println("Restaurante Eager: " + restauranteEager.getNome());

        // Thread-Safe Singleton
        RestauranteThreadSafe restauranteThreadSafe = RestauranteThreadSafe.getInstancia();
        System.out.println("Restaurante Thread-Safe: " + restauranteThreadSafe.getNome());

        // Bill Pugh Singleton
        RestauranteBillPugh restauranteBillPugh = RestauranteBillPugh.getInstancia();
        System.out.println("Restaurante Bill Pugh: " + restauranteBillPugh.getNome());

        // Enum Singleton
        RestauranteEnum restauranteEnum = RestauranteEnum.INSTANCIA;
        System.out.println("Restaurante Enum: " + restauranteEnum.getNome());

        // Double-Checked Locking Singleton
        RestauranteDoubleChecked restauranteDoubleChecked = RestauranteDoubleChecked.getInstancia();
        System.out.println("Restaurante Double-Checked: " + restauranteDoubleChecked.getNome());
    }
}
