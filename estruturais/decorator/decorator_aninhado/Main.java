package estruturais.decorator.decorator_aninhado;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new NotebookBasico();
        notebook = new WebcamDecorator(notebook);
        notebook = new BluetoothDecorator(notebook);

        notebook.ligar();
    }
}
