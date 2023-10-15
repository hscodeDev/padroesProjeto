package comportamentais.observer;

public class Main {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        DisplayCondicionesAtuais display1 = new DisplayCondicionesAtuais();
        DisplayCondicionesAtuais display2 = new DisplayCondicionesAtuais();

        estacao.adicionarObservador(display1);
        estacao.adicionarObservador(display2);

        estacao.setMedicoes(25.5, 65, 1013.2);
        estacao.setMedicoes(26.0, 70, 1012.8);
    }
}