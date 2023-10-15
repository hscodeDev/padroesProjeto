package comportamentais.observer;

public class DisplayCondicionesAtuais implements Observer{
    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println("Condições atuais:");
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Pressão atmosférica: " + pressao + " hPa");
        System.out.println();
    }
}
