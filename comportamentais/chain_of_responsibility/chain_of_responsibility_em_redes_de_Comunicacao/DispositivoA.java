package comportamentais.chain_of_responsibility.chain_of_responsibility_em_redes_de_Comunicacao;

public class DispositivoA implements Handler {
    @Override
    public void processarMensagem(String mensagem) {
        System.out.println("Dispositivo A recebeu: " + mensagem);
    }
}
