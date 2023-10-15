package comportamentais.command.comand_filas_transacoes;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

public class ConfirmarPagamentoCommand implements Command {
    private Restaurante restaurante;

    public ConfirmarPagamentoCommand(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void execute() {
        restaurante.confirmarPagamento();
    }

    @Override
    public void desfazer() {
        restaurante.cancelarPagamento();
    }
}