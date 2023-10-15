package comportamentais.command.comand_reservas_agendamento;

import comportamentais.command.Restaurante;
import comportamentais.command.command.Command;

import java.time.LocalDateTime;

public class AgendarMesaCommand implements Command {
    private Restaurante restaurante;
    private int numeroMesa;
    private LocalDateTime horario;

    public AgendarMesaCommand(Restaurante restaurante, int numeroMesa, LocalDateTime horario) {
        this.restaurante = restaurante;
        this.numeroMesa = numeroMesa;
        this.horario = horario;
    }

    @Override
    public void execute() {
        restaurante.agendarMesa(numeroMesa, horario);
    }

    @Override
    public void desfazer() {
        restaurante.cancelarMesa(numeroMesa, horario);
    }
}