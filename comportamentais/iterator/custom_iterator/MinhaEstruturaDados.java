package comportamentais.iterator.custom_iterator;

import java.util.Iterator;

public class MinhaEstruturaDados<T> implements Iterable<T> {
    private T[] elementos;
    private int tamanho;

    public MinhaEstruturaDados(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public void adicionar(T elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho++] = elemento;
        }
    }

    public Iterator<T> iterator() {
        return new MeuIterator();
    }

    private class MeuIterator implements Iterator<T> {
        private int indice = 0;

        public boolean hasNext() {
            return indice < tamanho;
        }

        public T next() {
            return elementos[indice++];
        }
    }
}
