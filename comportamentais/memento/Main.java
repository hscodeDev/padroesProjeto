package comportamentais.memento;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        GerenciadorDeAcoes gerenciador = new GerenciadorDeAcoes();

        editor.escreverTexto("Olá, ");
        gerenciador.adicionarMemento(editor.salvarEstado());

        editor.escreverTexto("Mundo!");
        gerenciador.adicionarMemento(editor.salvarEstado());

        System.out.println("Texto atual: " + editor.getTexto());

        editor.restaurarEstado(gerenciador.obterMemento(0));

        System.out.println("Texto restaurado: " + editor.getTexto());
    }
}