package estruturais.decorator.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        CafeBase cafeSimples = new CafeBase();
        CafeBase cafeLeite = new CafeComLeite();
        CafeBase cafeCreme = new CafeComCreme();

        System.out.println("Descrição do Café Simples: " + cafeSimples.descricao());
        System.out.println("Custo total: R$" + cafeSimples.custo());

        System.out.println("Descrição do Café com Leite: " + cafeLeite.descricao());
        System.out.println("Custo total: R$" + cafeLeite.custo());

        System.out.println("Descrição do Café com Creme: " + cafeCreme.descricao());
        System.out.println("Custo total: R$" + cafeCreme.custo());
    }
}
