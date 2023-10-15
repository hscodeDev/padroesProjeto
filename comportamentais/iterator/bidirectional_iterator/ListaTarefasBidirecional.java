package comportamentais.iterator.bidirectional_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListaTarefasBidirecional {
    private List<String> tarefas;

    public ListaTarefasBidirecional() {
        tarefas = new ArrayList<>();
        tarefas.add("Tarefa 1");
        tarefas.add("Tarefa 2");
        tarefas.add("Tarefa 3");
    }

    public ListIterator<String> iterator() {
        return tarefas.listIterator();
    }
}
