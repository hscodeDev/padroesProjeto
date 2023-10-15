package comportamentais.chain_of_responsibility.chain_of_responsibility_com_feedback;

public class Main {
    public static void main(String[] args) {
        String pedido = "Pedido de exemplo";
        String resultadoA = new ManipuladorA().processar(pedido);
        String resultadoB = new ManipuladorB().processar(resultadoA);
        System.out.println("Resultado final: " + resultadoB);
    }
}
