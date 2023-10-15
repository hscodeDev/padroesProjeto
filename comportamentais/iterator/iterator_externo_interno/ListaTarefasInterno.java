package comportamentais.iterator.iterator_externo_interno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListaTarefasInterno {
    private List<String> tarefas;

    public ListaTarefasInterno() {
        tarefas = new ArrayList<>();
        tarefas.add("Fazer compras");
        tarefas.add("Lavar o carro");
        tarefas.add("Estudar Java");
        tarefas.add("Passear com o cachorro");
    }

    public void forEach(Consumer<String> consumer) {
        tarefas.forEach(consumer);
    }
}
