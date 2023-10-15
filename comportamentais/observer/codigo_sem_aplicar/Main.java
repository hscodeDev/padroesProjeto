package comportamentais.observer.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        estacao.setMedicoes(25.5, 65, 1013.2);
        estacao.setMedicoes(26.0, 70, 1012.8);
    }
}