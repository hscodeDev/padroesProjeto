package comportamentais.command.command;

public class DesligarLayoutCommand  implements Command{
    private Lampada lampada;

    public DesligarLayoutCommand(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void execute() {
        lampada.desligar();
    }

    @Override
    public void desfazer() {
        lampada.ligar();
    }
}
