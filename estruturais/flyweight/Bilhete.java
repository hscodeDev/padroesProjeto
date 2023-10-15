package estruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Bilhete {
    private BilheteCompartilhado bilheteCompartilhado;
    private String nomeVisitante;

    public Bilhete(double preco, String dataValidade, String nomeVisitante, FabricaBilhetes fabricaBilhetes) {
        this.bilheteCompartilhado = fabricaBilhetes.getBilheteCompartilhado(preco, dataValidade);
        this.nomeVisitante = nomeVisitante;
    }

    public void mostrarInfo() {
        bilheteCompartilhado.mostrarInfo(nomeVisitante);
    }
}
