package comportamentais.state.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.ligar();
        meuCarro.carregar();
        meuCarro.ligar();
        meuCarro.desligar();
    }
}