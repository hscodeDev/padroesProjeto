package comportamentais.iterator.lazy_iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Cria uma lista preguiçosa de números de 1 a 10
        ListaLazy<Integer> listaLazy = new ListaLazy<>(
                () -> new Iterator<Integer>() {
                    private int current = 1;

                    public boolean hasNext() {
                        return current <= 10;
                    }

                    public Integer next() {
                        return current++;
                    }
                }
        );

        for (Integer num : listaLazy) {
            System.out.println(num);
        }
    }
}
