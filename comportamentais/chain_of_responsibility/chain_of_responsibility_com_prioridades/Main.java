package comportamentais.chain_of_responsibility.chain_of_responsibility_com_prioridades;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Handler> manipuladores = new ArrayList<>();
        manipuladores.add(new ManipuladorA());
        manipuladores.add(new ManipuladorB());
        manipuladores.add(new ManipuladorC());

        String pedido = "Pedido de exemplo";

        // Encontrando o manipulador com a maior prioridade
        Handler manipuladorPrioritario = null;
        int maiorPrioridade = Integer.MIN_VALUE;
        for (Handler manipulador : manipuladores) {
            if (manipulador.getPrioridade() > maiorPrioridade) {
                maiorPrioridade = manipulador.getPrioridade();
                manipuladorPrioritario = manipulador;
            }
        }

        if (manipuladorPrioritario != null) {
            manipuladorPrioritario.processar(pedido);
        }
    }
}
