package estruturais.decorator.decorator_aninhado;

public class BluetoothDecorator extends DecoradorNotebook{
    public BluetoothDecorator(Notebook notebook) {
        super(notebook);
    }

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Bluetooth ativado.");
    }
}
