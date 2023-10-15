package estruturais.flyweight.codigo_sem_aplicar;

public class Bilhete {
    private double preco;
    private String dataValidade;
    private String nomeVisitante;

    public Bilhete(double preco, String dataValidade, String nomeVisitante) {
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.nomeVisitante = nomeVisitante;
    }

    public void mostrarInfo() {
        System.out.println("Bilhete para " + nomeVisitante + ":");
        System.out.println("Preço: R$" + preco);
        System.out.println("Data de Validade: " + dataValidade);
    }
}
