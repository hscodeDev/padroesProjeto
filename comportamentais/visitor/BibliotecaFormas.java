package comportamentais.visitor;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaFormas {
    private List<Forma> formas = new ArrayList<>();

    void adicionarForma(Forma forma) {
        formas.add(forma);
    }

    void calcularAreasECircunferencias(Visitor visitante) {
        for (Forma forma : formas) {
            forma.aceitar(visitante);
        }
    }
}
