package comportamentais.strategy.strategy_com_contexto_condicional;

public class EnvioExpresso implements EstrategiaEnvio {
    public void enviar(String pacote) {
        System.out.println("Enviando pacote '" + pacote + "' via Envio Expresso.");
    }
}
