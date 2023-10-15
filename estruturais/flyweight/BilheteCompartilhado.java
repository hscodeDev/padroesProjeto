package estruturais.flyweight;

public class BilheteCompartilhado {
    private double preco;
    private String dataValidade;

    public BilheteCompartilhado(double preco, String dataValidade) {
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public void mostrarInfo(String nomeVisitante) {
        System.out.println("Bilhete para " + nomeVisitante + ":");
        System.out.println("Preço: R$" + preco);
        System.out.println("Data de Validade: " + dataValidade);
    }
}
