package comportamentais.memento.codigo_sem_aplicar;

import java.util.ArrayList;
import java.util.List;

public class EditorTexto {
    private String texto;
    private List<String> historico = new ArrayList<>();
    private int indiceHistorico = -1;

    public EditorTexto() {
        texto = "";
    }

    public void escreverTexto(String novoTexto) {
        if (indiceHistorico < historico.size() - 1) {
            historico.subList(indiceHistorico + 1, historico.size()).clear();
        }

        texto += novoTexto;
        historico.add(texto);
        indiceHistorico++;
    }

    public String getTexto() {
        return texto;
    }

    public boolean desfazer() {
        if (indiceHistorico > 0) {
            indiceHistorico--;
            texto = historico.get(indiceHistorico);
            return true;
        }
        return false;
    }

    public boolean refazer() {
        if (indiceHistorico < historico.size() - 1) {
            indiceHistorico++;
            texto = historico.get(indiceHistorico);
            return true;
        }
        return false;
    }
}
