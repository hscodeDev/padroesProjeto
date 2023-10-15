package comportamentais.strategy.strategy_com_contexto_condicional;

import java.util.HashMap;
import java.util.Map;

public class ContextoEnvio {
    private Map<String, EstrategiaEnvio> estrategias = new HashMap<>();

    public ContextoEnvio() {
        estrategias.put("Expresso", new EnvioExpresso());
        estrategias.put("Normal", new EnvioNormal());
    }

    public void enviarPacote(String tipo, String pacote) {
        EstrategiaEnvio estrategia = estrategias.get(tipo);
        if (estrategia != null) {
            estrategia.enviar(pacote);
        } else {
            System.out.println("Tipo de envio inválido.");
        }
    }
}
