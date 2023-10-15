package comportamentais.iterator.iterator_externo_interno;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Externo:");
        ListaTarefasExterno listaExterno = new ListaTarefasExterno();
        Iterator<String> iteratorExterno = listaExterno.iterator();
        while (iteratorExterno.hasNext()) {
            System.out.println(iteratorExterno.next());
        }

        System.out.println("\nIterator Interno:");
        ListaTarefasInterno listaInterno = new ListaTarefasInterno();
        listaInterno.forEach(System.out::println);
    }
}
