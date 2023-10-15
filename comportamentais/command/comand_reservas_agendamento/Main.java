package comportamentais.command.comand_reservas_agendamento;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        LocalDateTime horarioReserva = LocalDateTime.now().plusHours(1);

        Command agendarReserva = new AgendarMesaCommand(restaurante, 1, horarioReserva);
        agendarReserva.execute();
    }
}
