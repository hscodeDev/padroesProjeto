package comportamentais.command.comand_filas_historicos;

import comportamentais.command.command.Command;

import java.util.ArrayList;
import java.util.List;

public class HistoricoComandos implements Command {
    private List<Command> historico = new ArrayList<>();
    private int indice = -1;

    public void adicionarComando(Command command) {
        historico.add(command);
        indice++;
    }

    @Override
    public void desfazer() {
        if (indice >= 0) {
            historico.get(indice).desfazer();
            indice--;
        }
    }

    public void refazer() {
        if (indice < historico.size() - 1) {
            indice++;
            historico.get(indice).execute();
        }
    }

    @Override
    public void execute() {
        for (Command command : historico) {
            command.execute();
        }
    }
}
