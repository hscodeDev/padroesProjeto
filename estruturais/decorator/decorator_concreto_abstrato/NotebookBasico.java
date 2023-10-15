package estruturais.decorator.decorator_concreto_abstrato;

public class NotebookBasico implements Notebook{
    @Override
    public void ligar() {
        System.out.println("Notebook básico ligado.");
    }
}
