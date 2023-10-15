package comportamentais.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediadorChat implements Mediador{
    private List<Participante> participantes = new ArrayList<>();

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

    @Override
    public void enviarMensagem(String mensagem, Participante participante) {
        for (Participante p : participantes) {
            // Certifique-se de que o remetente não receba sua própria mensagem
            if (p != participante) {
                p.receberMensagem(mensagem);
            }
        }
    }
}
