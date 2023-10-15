package comportamentais.iterator.filtered_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefasFiltrada {
    private List<Tarefa> tarefas;

    public ListaTarefasFiltrada() {
        tarefas = new ArrayList<>();
        tarefas.add(new Tarefa("Fazer compras", false));
        tarefas.add(new Tarefa("Lavar o carro", true));
        tarefas.add(new Tarefa("Estudar Java", false));
        tarefas.add(new Tarefa("Passear com o cachorro", true));
    }

    public Iterator<Tarefa> iterator(boolean apenasConcluidas) {
        return tarefas.stream()
                .filter(tarefa -> !apenasConcluidas || tarefa.isConcluida())
                .iterator();
    }
}
