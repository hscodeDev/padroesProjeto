package criacionais.singleton.singleton.codigoSemAplicar;

public class ContadorAcessos {
    private int contador;

    public ContadorAcessos() {
        contador = 0;
    }

    public void incrementarAcesso() {
        contador++;
    }

    public int getNumeroAcessos() {
        return contador;
    }
}
