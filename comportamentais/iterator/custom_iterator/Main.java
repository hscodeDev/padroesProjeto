package comportamentais.iterator.custom_iterator;

public class Main {
    public static void main(String[] args) {
        MinhaEstruturaDados<Integer> estrutura = new MinhaEstruturaDados<>(5);
        estrutura.adicionar(1);
        estrutura.adicionar(2);
        estrutura.adicionar(3);

        for (Integer elemento : estrutura) {
            System.out.println(elemento);
        }
    }
}
