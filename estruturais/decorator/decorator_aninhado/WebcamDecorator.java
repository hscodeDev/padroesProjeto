package estruturais.decorator.decorator_aninhado;

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
