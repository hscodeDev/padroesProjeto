package comportamentais.state;

public class Carro {
    private EstadoCarro estado;

    public Carro() {
        estado = new EstadoDescarregado();
    }

    public void setEstado(EstadoCarro novoEstado) {
        estado = novoEstado;
    }

    public void ligar() {
        estado.ligar();
    }

    public void desligar() {
        estado.desligar();
    }

    public void carregar() {
        estado.carregar();
    }
}