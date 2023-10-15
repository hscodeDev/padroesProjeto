package comportamentais.command.command_parametrizados;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Command adicionarCommand = new AdicionarItemCommand(restaurante, "Pizza");
        adicionarCommand.execute();

        Command removerCommand = new AdicionarItemCommand(restaurante, "Pizza");
        removerCommand.desfazer();
    }
}
