package comportamentais.iterator.reverse_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListaTarefasReversa {
    private List<String> tarefas;

    public ListaTarefasReversa() {
        tarefas = new ArrayList<>();
        tarefas.add("Tarefa 1");
        tarefas.add("Tarefa 2");
        tarefas.add("Tarefa 3");
    }

    public ListIterator<String> reverseIterator() {
        List<String> reversed = new ArrayList<>(tarefas);
        Collections.reverse(reversed);
        return reversed.listIterator();
    }
}
