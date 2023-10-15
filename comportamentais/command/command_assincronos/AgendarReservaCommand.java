package comportamentais.command.command_assincronos;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

import java.time.LocalDateTime;

public class AgendarReservaCommand implements Command {
    private Restaurante restaurante;
    private LocalDateTime horario;

    public AgendarReservaCommand(Restaurante restaurante, LocalDateTime horario) {
        this.restaurante = restaurante;
        this.horario = horario;
    }

    @Override
    public void execute() {
        restaurante.agendarReserva(horario);
    }

    @Override
    public void desfazer() {
        restaurante.cancelarReserva(horario);
    }
}