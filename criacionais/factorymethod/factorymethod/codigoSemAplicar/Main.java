package criacionais.factorymethod.factorymethod.codigoSemAplicar;

public class Main {
    public static void main(String[] args) {
        Pao paoFrances = new Pao("Pão Francês");
        Pao paoIntegral = new Pao("Pão Integral");
        Pao paoCenteio = new Pao("Pão de Centeio");

        System.out.println("Pão criado: " + paoFrances.getDescricao());
        System.out.println("Pão criado: " + paoIntegral.getDescricao());
        System.out.println("Pão criado: " + paoCenteio.getDescricao());
    }
}