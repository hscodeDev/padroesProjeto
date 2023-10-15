package comportamentais.iterator.parallel_iterator;

import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ListaTarefasParalela listaParalela = new ListaTarefasParalela();
        Iterable<Future<String>> iterator = listaParalela.parallelIterator();

        for (Future<String> result : iterator) {
            try {
                System.out.println(result.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
