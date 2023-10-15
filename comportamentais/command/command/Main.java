package comportamentais.command.command;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        Lampada lampada = new Lampada();

        Command ligarLampada = new LigarLayoutCommand(lampada);
        Command desligarLampada = new DesligarLayoutCommand(lampada);

        controle.adicionarComando(ligarLampada);
        controle.adicionarComando(desligarLampada);

        controle.executarComandos();

        controle.desfazerComandos();
    }
}
