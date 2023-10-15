package comportamentais.command.comand_filas_historicos;

import comportamentais.command.Restaurante;
import comportamentais.command.comand_undo_redo.ModificarQuantidadeItemCommand;
import comportamentais.command.command.Command;
import comportamentais.command.command_parametrizados.AdicionarItemCommand;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        HistoricoComandos historico = new HistoricoComandos();

        Command adicionarItem = new AdicionarItemCommand(restaurante, "Salada");
        historico.adicionarComando(adicionarItem);

        Command removerItem = new AdicionarItemCommand(restaurante, "Pizza");
        historico.adicionarComando(removerItem);

        restaurante.adicionarItemAoPedido("Hambúrguer");
        historico.adicionarComando(new ModificarQuantidadeItemCommand(restaurante, "Hambúrguer", 2));

        historico.execute(); // Executa todos os comandos no histórico
    }
}
