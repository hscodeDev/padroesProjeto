package estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaBilhetes {
    private Map<String, BilheteCompartilhado> bilhetesCompartilhados = new HashMap<>();

    public BilheteCompartilhado getBilheteCompartilhado(double preco, String dataValidade) {
        String chave = preco + "-" + dataValidade;
        if (!bilhetesCompartilhados.containsKey(chave)) {
            BilheteCompartilhado bilhete = new BilheteCompartilhado(preco, dataValidade);
            bilhetesCompartilhados.put(chave, bilhete);
        }
        return bilhetesCompartilhados.get(chave);
    }
}
