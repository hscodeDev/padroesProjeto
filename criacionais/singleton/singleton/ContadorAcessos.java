package criacionais.singleton.singleton;

public class ContadorAcessos {
    private static ContadorAcessos instancia = null;
    private int contador;

    private ContadorAcessos() {
        this.contador = 0;
    }

    public static ContadorAcessos getInstance() {
        if (instancia == null) {
            instancia = new ContadorAcessos();
        }
        return instancia;
    }

    public void incrementarAcesso() {
        this.contador++;
    }

    public int getNumeroAcessos() {
        return this.contador;
    }
}
