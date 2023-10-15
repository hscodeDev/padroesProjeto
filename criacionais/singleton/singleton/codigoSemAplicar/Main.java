package criacionais.singleton.singleton.codigoSemAplicar;

public class Main {
    public static void main(String[] args) {
        //Código sem Aplicar
        // Cria duas instâncias independentes do contador de acessos
        ContadorAcessos contador1 = new ContadorAcessos();
        ContadorAcessos contador2 = new ContadorAcessos();

        contador1.incrementarAcesso();
        contador1.incrementarAcesso();

        contador2.incrementarAcesso();
        contador2.incrementarAcesso();
        contador2.incrementarAcesso();

        int numeroAcessos1 = contador1.getNumeroAcessos();
        int numeroAcessos2 = contador2.getNumeroAcessos();

        System.out.println("Número total de acessos na instância 1: " + numeroAcessos1);
        System.out.println("Número total de acessos na instância 2: " + numeroAcessos2);
    }
}
