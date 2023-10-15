package comportamentais.chain_of_responsibility.codigo_sem_aplicar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a duração das férias (em dias): ");
        int diasFerias = scanner.nextInt();

        if (diasFerias <= 5) {
            System.out.println("Supervisor aprovou as férias.");
        } else if (diasFerias <= 10) {
            System.out.println("Gerente aprovou as férias.");
        } else {
            System.out.println("Diretor aprovou as férias.");
        }

        scanner.close();
    }
}