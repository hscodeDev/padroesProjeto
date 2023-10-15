package estruturais.decorator.decorator_aninhado;

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
