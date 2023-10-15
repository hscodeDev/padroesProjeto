package estruturais.flyweight;

public class Main {
    public static void main(String[] args) {
        FabricaBilhetes fabricaBilhetes = new FabricaBilhetes();

        // Criando bilhetes para diferentes visitantes com informações compartilhadas
        Bilhete bilhete1 = new Bilhete(50.0, "30/09/2023", "João", fabricaBilhetes);
        Bilhete bilhete2 = new Bilhete(50.0, "30/09/2023", "Maria", fabricaBilhetes);

        // Mostrando informações dos bilhetes
        bilhete1.mostrarInfo();
        bilhete2.mostrarInfo();

        // Observe que os bilhetes compartilham informações, economizando memória
    }
}