package comportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAcoes {
    private List<Memento> historico = new ArrayList<>();

    public void adicionarMemento(Memento memento) {
        historico.add(memento);
    }

    public Memento obterMemento(int indice) {
        return historico.get(indice);
    }
}
