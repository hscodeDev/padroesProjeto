package comportamentais.strategy.strategy.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente A", 10.0, 0.0); // Desconto fixo de R$ 10.0
        Cliente cliente2 = new Cliente("Cliente B", 0.0, 20.0); // Desconto percentual de 20%

        double valorCompraCliente1 = 100.0;
        double valorCompraCliente2 = 200.0;

        System.out.println(cliente1.getNome() + " recebe um desconto de R$" + cliente1.calcularDesconto(valorCompraCliente1));
        System.out.println(cliente2.getNome() + " recebe um desconto de R$" + cliente2.calcularDesconto(valorCompraCliente2));
    }
}