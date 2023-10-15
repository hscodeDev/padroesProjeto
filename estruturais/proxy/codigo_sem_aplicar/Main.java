package estruturais.proxy.codigo_sem_aplicar;

public class Main {
    public static void main(String[] args) {
        ConteudoAdulto conteudo = new ConteudoAdulto();

        conteudo.acessar(21);

        conteudo.acessar(16);
    }
}