package comportamentais.observer.codigo_sem_aplicar;

public class EstacaoMeteorologica {
    private double temperatura;
    private double umidade;
    private double pressao;

    public void setMedicoes(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        exibirCondicionesAtuais();
    }

    private void exibirCondicionesAtuais() {
        System.out.println("Condições atuais:");
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Pressão atmosférica: " + pressao + " hPa");
        System.out.println();
    }
}