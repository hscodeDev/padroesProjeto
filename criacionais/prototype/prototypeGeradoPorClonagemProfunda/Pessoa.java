package criacionais.prototype.prototypeGeradoPorClonagemProfunda;

import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Cloneable {
    private String nome;
    private List<String> hobbies;

    public Pessoa(String nome, List<String> hobbies) {
        this.nome = nome;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Hobbies: " + hobbies);
    }

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        List<String> hobbiesClone = new ArrayList<>(this.hobbies);
        return new Pessoa(this.nome, hobbiesClone);
    }
}
