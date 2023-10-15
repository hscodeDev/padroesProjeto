package comportamentais.iterator.bidirectional_iterator;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ListaTarefasBidirecional listaBidirecional = new ListaTarefasBidirecional();
        ListIterator<String> iterator = listaBidirecional.iterator();

        System.out.println("Iteração da frente para trás:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIteração de trás para frente:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
