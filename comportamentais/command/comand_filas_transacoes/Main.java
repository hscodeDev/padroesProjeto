package comportamentais.command.comand_filas_transacoes;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;
import comportamentais.command.command_parametrizados.AdicionarItemCommand;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Command adicionarItem1 = new AdicionarItemCommand(restaurante, "Batata Frita");
        Command adicionarItem2 = new AdicionarItemCommand(restaurante, "Refrigerante");
        Command confirmarPagamento = new ConfirmarPagamentoCommand(restaurante);

        adicionarItem1.execute();
        adicionarItem2.execute();

        restaurante.confirmarPagamento(); // Transação bem-sucedida

        confirmarPagamento.desfazer(); // Desfazer pagamento
    }
}
