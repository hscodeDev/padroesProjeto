package comportamentais.command.command_aninhados;

import comportamentais.command.command.Command;

import java.util.ArrayList;
import java.util.List;

public class PedidoCommand implements Command {
    private List<Command> comandos = new ArrayList<>();

    public void adicionarComando(Command command) {
        comandos.add(command);
    }

    @Override
    public void execute() {
        for (Command command : comandos) {
            command.execute();
        }
    }

    @Override
    public void desfazer() {
        for (Command command : comandos) {
            command.desfazer();
        }
    }
}