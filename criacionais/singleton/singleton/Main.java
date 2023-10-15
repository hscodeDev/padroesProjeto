package criacionais.singleton.singleton;

public class Main {
    public static void main(String[] args) {
        ContadorAcessos contadorAcessos = ContadorAcessos.getInstance();
        contadorAcessos.incrementarAcesso();
        contadorAcessos.incrementarAcesso();
        contadorAcessos.incrementarAcesso();

        int numeroAcessos = contadorAcessos.getNumeroAcessos();
        System.out.println("Número total de acessos " + numeroAcessos);
    }
}
