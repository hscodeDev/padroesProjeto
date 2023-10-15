package comportamentais.iterator.iterator.codigo_sem_aplicar;

import comportamentais.iterator.iterator.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new ArrayList<>();
        // Adicione algumas tarefas para fins de demonstração
        tarefas.add(new Tarefa("Fazer compras", false));
        tarefas.add(new Tarefa("Lavar o carro", true));
        tarefas.add(new Tarefa("Estudar Java", false));
        tarefas.add(new Tarefa("Passear com o cachorro", true));
    }

    // Método para percorrer a lista de tarefas manualmente
    public void percorrerTarefasConcluidas() {
        System.out.println("Tarefas concluídas:");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                System.out.println(tarefa.getDescricao());
            }
        }
    }
}
