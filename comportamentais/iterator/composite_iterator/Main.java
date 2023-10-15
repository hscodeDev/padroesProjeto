package comportamentais.iterator.composite_iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("Item 1");
        lista1.add("Item 2");

        List<String> lista2 = new ArrayList<>();
        lista2.add("Item 3");

        ListaComposta<String> listaComposta = new ListaComposta<>();
        listaComposta.adicionarLista(lista1);
        listaComposta.adicionarLista(lista2);

        for (String item : listaComposta) {
            System.out.println(item);
        }
    }
}