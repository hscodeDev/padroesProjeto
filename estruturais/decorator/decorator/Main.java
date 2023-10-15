package estruturais.decorator.decorator;

public class Main {
    public static void main(String[] args) {
        Cafe meuCafe = new CafeSimples();
        meuCafe = new LeiteDecorator(meuCafe);

        meuCafe = new CremeDecorator(meuCafe);

        System.out.println("Descrição: " + meuCafe.descricao());
        System.out.println("Custo total: R$" + meuCafe.custo());
    }
}