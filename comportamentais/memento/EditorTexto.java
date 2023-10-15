package comportamentais.memento;

public class EditorTexto {
    private String texto;

    public EditorTexto() {
        texto = "";
    }

    public void escreverTexto(String novoTexto) {
        texto += novoTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Memento salvarEstado() {
        return new Memento(texto);
    }

    public void restaurarEstado(Memento memento) {
        texto = memento.getEstadoSalvo();
    }
}