package estruturais.decorator.decorator_dinamico;

public class NotebookBasico implements Notebook{
    @Override
    public void ligar() {
        System.out.println("Notebook básico ligado.");
    }
}
