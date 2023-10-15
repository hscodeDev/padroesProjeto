package comportamentais.chain_of_responsibility.chain_of_responsibility_hierarquico;

public class Main {
    public static void main(String[] args) {
        ManipuladorA manipuladorA = new ManipuladorA();
        ManipuladorB manipuladorB = new ManipuladorB();
        ManipuladorC manipuladorC = new ManipuladorC();

        manipuladorA.setProximo(manipuladorB);
        manipuladorB.setProximo(manipuladorC);

        String pedido = "Pedido de exemplo";
        manipuladorA.processar(pedido);
    }
}