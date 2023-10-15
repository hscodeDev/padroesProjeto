package comportamentais.iterator.parallel_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ListaTarefasParalela {
    private List<String> tarefas;

    public ListaTarefasParalela() {
        tarefas = new ArrayList<>();
        tarefas.add("Tarefa 1");
        tarefas.add("Tarefa 2");
        tarefas.add("Tarefa 3");
    }

    public Iterable<Future<String>> parallelIterator() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<String>> results = new ArrayList<>();

        for (String tarefa : tarefas) {
            Future<String> result = executorService.submit(() -> {
                // Simula um processamento demorado
                Thread.sleep(1000);
                return tarefa.toUpperCase();
            });
            results.add(result);
        }

        return results;
    }
}
