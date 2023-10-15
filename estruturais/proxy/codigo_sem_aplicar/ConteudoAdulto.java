package estruturais.proxy.codigo_sem_aplicar;

public class ConteudoAdulto {
    public void acessar(int idadeUsuario) {
        if (idadeUsuario >= 18) {
            System.out.println("Acesso ao conteúdo adulto concedido.");
        } else {
            System.out.println("Você não tem idade suficiente para acessar o conteúdo adulto.");
        }
    }
}