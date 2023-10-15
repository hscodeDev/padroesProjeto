package estruturais.composite.composite_com_nomeacao;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto 1", 50);
        System.out.println("Nome do Produto 1: " + p1.getNome());
    }
}