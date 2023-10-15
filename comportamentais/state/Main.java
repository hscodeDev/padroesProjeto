package comportamentais.state;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.ligar();
        meuCarro.carregar();
        meuCarro.setEstado(new EstadoTotalmenteCarregado());
        meuCarro.ligar();
        meuCarro.desligar();
    }
}