package comportamentais.command.command_assincronos;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        LocalDateTime horarioReserva = LocalDateTime.now().plusHours(2);

        Command agendarReserva = new AgendarReservaCommand(restaurante, horarioReserva);
        agendarReserva.execute();
    }
}
