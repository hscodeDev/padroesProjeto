package estruturais.decorator.decorator_concreto_abstrato;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new NotebookBasico();
        notebook = new WebcamDecorator(notebook);

        notebook.ligar();
    }
}
