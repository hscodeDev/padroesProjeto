package comportamentais.strategy.strategy_com_contexto_condicional;

public class Main {
    public static void main(String[] args) {
        ContextoEnvio contexto = new ContextoEnvio();
        contexto.enviarPacote("Expresso", "Pacote 123");
        contexto.enviarPacote("Normal", "Pacote 456");
        contexto.enviarPacote("Econômico", "Pacote 789"); // Tipo inválido
    }
}
