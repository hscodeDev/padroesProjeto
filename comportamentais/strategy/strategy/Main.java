package comportamentais.strategy.strategy;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente A", new DescontoFixo(10.0));
        Cliente cliente2 = new Cliente("Cliente B", new DescontoPercentual(20.0));

        double valorCompraCliente1 = 100.0;
        double valorCompraCliente2 = 200.0;

        System.out.println(cliente1.getNome() + " recebe um desconto de R$" + cliente1.calcularDesconto(valorCompraCliente1));
        System.out.println(cliente2.getNome() + " recebe um desconto de R$" + cliente2.calcularDesconto(valorCompraCliente2));
    }
}