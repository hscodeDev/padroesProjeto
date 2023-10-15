package comportamentais.chain_of_responsibility.chain_of_responsibility_em_redes_de_Comunicacao;

public class Main {
    public static void main(String[] args) {
        Handler dispositivoA = new DispositivoA();
        Handler dispositivoB = new DispositivoB();

        // Simulação de comunicação em rede
        String mensagem = "Mensagem importante";
        dispositivoA.processarMensagem(mensagem);
        dispositivoB.processarMensagem(mensagem);
    }
}
