package comportamentais.iterator.iterator;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas implements Iterator<Tarefa>{
    private List<Tarefa> tarefas;
    private int indice;

    public ListaTarefas() {
        tarefas = new ArrayList<>();
        tarefas.add(new Tarefa("Fazer compras", false));
        tarefas.add(new Tarefa("Lavar o carro", true));
        tarefas.add(new Tarefa("Estudar Java", false));
        tarefas.add(new Tarefa("Passear com o cachorro", true));
        indice = 0;
    }

    @Override
    public boolean hasNext() {
        return indice < tarefas.size();
    }

    @Override
    public Tarefa next() {
        if (hasNext()) {
            return tarefas.get(indice++);
        }
        return null;
    }
}
