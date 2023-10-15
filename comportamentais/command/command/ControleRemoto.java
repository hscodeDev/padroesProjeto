package comportamentais.command.command;

import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {
    private List<Command> comandos = new ArrayList<>();

    void adicionarComando(Command command) {
        comandos.add(command);
    }

    void executarComandos() {
        for (Command command : comandos) {
            command.execute();
        }
        comandos.clear();
    }

    void desfazerComandos() {
        for (int i = comandos.size() - 1; i >= 0; i--) {
            comandos.get(i).desfazer();
        }
        comandos.clear();
    }
}
