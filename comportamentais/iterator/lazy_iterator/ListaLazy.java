package comportamentais.iterator.lazy_iterator;


import java.util.Iterator;
import java.util.function.Supplier;

public class ListaLazy<T> implements Iterable<T> {
    private Supplier<Iterator<T>> iteratorSupplier;

    public ListaLazy(Supplier<Iterator<T>> iteratorSupplier) {
        this.iteratorSupplier = iteratorSupplier;
    }

    public Iterator<T> iterator() {
        return iteratorSupplier.get();
    }
}
