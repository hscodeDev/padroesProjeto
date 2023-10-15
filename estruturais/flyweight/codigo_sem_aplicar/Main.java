package estruturais.flyweight.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        // Criando bilhetes individuais para diferentes visitantes
        Bilhete bilhete1 = new Bilhete(50.0, "30/09/2023", "João");
        Bilhete bilhete2 = new Bilhete(50.0, "30/09/2023", "Maria");

        // Mostrando informações dos bilhetes
        bilhete1.mostrarInfo();
        bilhete2.mostrarInfo();

        // Observe que os bilhetes não compartilham informações, o que pode resultar em consumo excessivo de memória
    }
}