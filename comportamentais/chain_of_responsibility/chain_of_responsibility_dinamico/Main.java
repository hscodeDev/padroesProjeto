package comportamentais.chain_of_responsibility.chain_of_responsibility_dinamico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Handler> manipuladores = new ArrayList<>();

        String pedido = "Pedido de exemplo";

        // Adicionando manipuladores dinamicamente
        manipuladores.add(new ManipuladorA());

        // Processando com os manipuladores atuais
        for (Handler manipulador : manipuladores) {
            manipulador.processar(pedido);
        }

        // Adicionando outro manipulador dinamicamente
        manipuladores.add(new ManipuladorB());

        // Processando novamente com os manipuladores atualizados
        for (Handler manipulador : manipuladores) {
            manipulador.processar(pedido);
        }
    }
}
