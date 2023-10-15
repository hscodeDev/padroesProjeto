package estruturais.decorator.decorator_concreto_abstrato;

public class DecoradorNotebook implements Notebook{
    private final Notebook notebook;

    public DecoradorNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    @Override
    public void ligar() {
        notebook.ligar();
    }
}
