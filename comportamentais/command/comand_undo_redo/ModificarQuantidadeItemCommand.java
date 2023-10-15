package comportamentais.command.comand_undo_redo;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

public class ModificarQuantidadeItemCommand implements Command {
    private Restaurante restaurante;
    private String item;
    private int quantidadeAnterior;
    private int novaQuantidade;

    public ModificarQuantidadeItemCommand(Restaurante restaurante, String item, int novaQuantidade) {
        this.restaurante = restaurante;
        this.item = item;
        this.novaQuantidade = novaQuantidade;
    }

    @Override
    public void execute() {
        quantidadeAnterior = restaurante.getQuantidadeDoItem(item);
        restaurante.modificarQuantidadeDoItem(item, novaQuantidade);
    }

    @Override
    public void desfazer() {
        restaurante.modificarQuantidadeDoItem(item, quantidadeAnterior);
    }
}
