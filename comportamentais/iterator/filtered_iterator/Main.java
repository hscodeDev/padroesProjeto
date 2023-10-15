package comportamentais.iterator.filtered_iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListaTarefasFiltrada listaFiltrada = new ListaTarefasFiltrada();

        System.out.println("Tarefas concluídas:");
        Iterator<Tarefa> iteratorConcluidas = listaFiltrada.iterator(true);
        while (iteratorConcluidas.hasNext()) {
            System.out.println(iteratorConcluidas.next().getDescricao());
        }

        System.out.println("\nTodas as tarefas:");
        Iterator<Tarefa> iteratorTodas = listaFiltrada.iterator(false);
        while (iteratorTodas.hasNext()) {
            System.out.println(iteratorTodas.next().getDescricao());
        }
    }
}
