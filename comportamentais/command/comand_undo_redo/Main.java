package comportamentais.command.comand_undo_redo;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.adicionarItemAoPedido("Hambúrguer");

        Command modificarQuantidade = new ModificarQuantidadeItemCommand(restaurante, "Hambúrguer", 2);
        modificarQuantidade.execute();
        restaurante.modificarQuantidadeDoItem("Hambúrguer", 3);

        System.out.println("Quantidade atual: " + restaurante.getQuantidadeDoItem("Hambúrguer"));

        modificarQuantidade.desfazer();

        System.out.println("Quantidade após desfazer: " + restaurante.getQuantidadeDoItem("Hambúrguer"));
    }
}
