package comportamentais.command.command;

public class LigarLayoutCommand implements Command{
    private Lampada lampada;

    public LigarLayoutCommand(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void execute() {
        lampada.ligar();
    }

    @Override
    public void desfazer() {
        lampada.desligar();
    }
}
