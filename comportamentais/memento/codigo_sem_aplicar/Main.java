package comportamentais.memento.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.escreverTexto("Olá, ");
        editor.escreverTexto("Mundo!");

        System.out.println("Texto atual: " + editor.getTexto());

        editor.desfazer();

        System.out.println("Texto desfeito: " + editor.getTexto());

        editor.refazer();

        System.out.println("Texto refeito: " + editor.getTexto());
    }
}