package comportamentais.command;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Restaurante {
    private Map<String, Integer> pedido = new HashMap<>();
    private Map<LocalDateTime, Integer> reservas = new HashMap<>();
    private Map<Integer, LocalDateTime> mesasAgendadas = new HashMap<>();
    private boolean pagamentoConfirmado = false;

    // Métodos para manipular o pedido
    public void adicionarItemAoPedido(String item) {
        pedido.put(item, pedido.getOrDefault(item, 0) + 1);
        System.out.println("Item adicionado ao pedido: " + item);
    }

    public void removerItemDoPedido(String item) {
        if (pedido.containsKey(item)) {
            pedido.put(item, pedido.get(item) - 1);
            System.out.println("Item removido do pedido: " + item);
        }
    }

    public int getQuantidadeDoItem(String item) {
        return pedido.getOrDefault(item, 0);
    }

    public void modificarQuantidadeDoItem(String item, int quantidade) {
        pedido.put(item, quantidade);
        System.out.println("Quantidade do item modificada: " + item);
    }

    // Métodos para reservas
    public void agendarReserva(LocalDateTime horario) {
        reservas.put(horario, reservas.getOrDefault(horario, 0) + 1);
        System.out.println("Reserva agendada para: " + horario);
    }

    public void cancelarReserva(LocalDateTime horario) {
        if (reservas.containsKey(horario)) {
            reservas.put(horario, reservas.get(horario) - 1);
            System.out.println("Reserva cancelada para: " + horario);
        }
    }

    // Métodos para mesas agendadas
    public void agendarMesa(int numeroMesa, LocalDateTime horario) {
        mesasAgendadas.put(numeroMesa, horario);
        System.out.println("Mesa " + numeroMesa + " agendada para: " + horario);
    }

    public void cancelarMesa(int numeroMesa, LocalDateTime horario) {
        if (mesasAgendadas.containsKey(numeroMesa) && mesasAgendadas.get(numeroMesa).equals(horario)) {
            mesasAgendadas.remove(numeroMesa);
            System.out.println("Agendamento da mesa " + numeroMesa + " cancelado para: " + horario);
        }
    }

    // Métodos para pagamento
    public void confirmarPagamento() {
        pagamentoConfirmado = true;
        System.out.println("Pagamento confirmado.");
    }

    public void cancelarPagamento() {
        pagamentoConfirmado = false;
        System.out.println("Pagamento cancelado.");
    }
}
