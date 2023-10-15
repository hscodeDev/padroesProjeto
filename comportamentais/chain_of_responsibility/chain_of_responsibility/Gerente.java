package comportamentais.chain_of_responsibility.chain_of_responsibility;

public class Gerente implements Aprovador{
    private Aprovador proximo;

    @Override
    public void aprovar(int dias) {
        if (dias <= 10) {
            System.out.println("Gerente aprovou as férias.");
        } else if (proximo != null) {
            proximo.aprovar(dias);
        } else {
            System.out.println("Nenhum autorizador disponível para aprovar as férias.");
        }
    }

    @Override
    public void definirProximoAprovador(Aprovador proximo) {
        this.proximo = proximo;
    }
}
