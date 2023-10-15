package comportamentais.chain_of_responsibility.chain_of_responsibility;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Aprovador supervisor = new Supervisor();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();

        supervisor.definirProximoAprovador(gerente);
        gerente.definirProximoAprovador(diretor);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a duração das férias (em dias): ");
        int diasFerias = scanner.nextInt();

        supervisor.aprovar(diasFerias);

        scanner.close();
    }
}
