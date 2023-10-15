package comportamentais.iterator.reverse_iterator;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ListaTarefasReversa listaReversa = new ListaTarefasReversa();
        ListIterator<String> iterator = listaReversa.reverseIterator();

        System.out.println("Iteração reversa:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
