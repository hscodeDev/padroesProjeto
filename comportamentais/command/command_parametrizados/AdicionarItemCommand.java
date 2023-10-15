package comportamentais.command.command_parametrizados;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

public class AdicionarItemCommand implements Command {
    private Restaurante restaurante;
    private String item;

    public AdicionarItemCommand(Restaurante restaurante, String item) {
        this.restaurante = restaurante;
        this.item = item;
    }

    @Override
    public void execute() {
        restaurante.adicionarItemAoPedido(item);
    }

    @Override
    public void desfazer() {
        restaurante.removerItemDoPedido(item);
    }
}
