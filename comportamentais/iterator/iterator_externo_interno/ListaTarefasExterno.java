package comportamentais.iterator.iterator_externo_interno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefasExterno {
    private List<String> tarefas;

    public ListaTarefasExterno() {
        tarefas = new ArrayList<>();
        tarefas.add("Fazer compras");
        tarefas.add("Lavar o carro");
        tarefas.add("Estudar Java");
        tarefas.add("Passear com o cachorro");
    }

    public Iterator<String> iterator() {
        return tarefas.iterator();
    }
}
