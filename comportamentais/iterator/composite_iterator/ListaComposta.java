package comportamentais.iterator.composite_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaComposta<T> implements Iterable<T> {
    private List<Iterable<T>> listas;

    public ListaComposta() {
        listas = new ArrayList<>();
    }

    public void adicionarLista(Iterable<T> lista) {
        listas.add(lista);
    }

    public Iterator<T> iterator() {
        return new CompositeIterator();
    }

    private class CompositeIterator implements Iterator<T> {
        private Iterator<Iterable<T>> listaIterator = listas.iterator();
        private Iterator<T> elementoIterator = null;

        public boolean hasNext() {
            while ((elementoIterator == null || !elementoIterator.hasNext()) && listaIterator.hasNext()) {
                elementoIterator = listaIterator.next().iterator();
            }
            return elementoIterator != null && elementoIterator.hasNext();
        }

        public T next() {
            if (hasNext()) {
                return elementoIterator.next();
            }
            return null;
        }

    }
}
