package comportamentais.command.command_aninhados;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;
import comportamentais.command.command_parametrizados.AdicionarItemCommand;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Command adicionarItem1 = new AdicionarItemCommand(restaurante, "Sushi");
        Command adicionarItem2 = new AdicionarItemCommand(restaurante, "Sashimi");

        PedidoCommand pedido = new PedidoCommand();
        pedido.adicionarComando(adicionarItem1);
        pedido.adicionarComando(adicionarItem2);

        pedido.execute();
    }
}
