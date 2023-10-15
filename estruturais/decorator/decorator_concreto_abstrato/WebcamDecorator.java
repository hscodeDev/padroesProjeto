package estruturais.decorator.decorator_concreto_abstrato;

public class WebcamDecorator extends DecoradorNotebook {
    public WebcamDecorator(Notebook notebook) {
        super(notebook);
    }

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Webcam ativada.");
    }
}
