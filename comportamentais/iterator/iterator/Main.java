package comportamentais.iterator.iterator;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Tarefas concluídas:");
        while (listaTarefas.hasNext()) {
            Tarefa tarefa = listaTarefas.next();
            if (tarefa.isConcluida()) {
                System.out.println(tarefa.getDescricao());
            }
        }
    }
}
