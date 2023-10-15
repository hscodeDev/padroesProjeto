package estruturais.decorator.decorator_dinamico;

import estruturais.decorator.decorator_dinamico.DecoratorDinamico;
import estruturais.decorator.decorator_dinamico.Notebook;
import estruturais.decorator.decorator_dinamico.NotebookBasico;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new NotebookBasico();
        notebook = DecoratorDinamico.adicionarFuncionalidade(notebook, n -> System.out.println("Webcam ativada."));

        notebook.ligar();
    }
}
