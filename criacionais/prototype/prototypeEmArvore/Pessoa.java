package criacionais.prototype.prototypeEmArvore;

import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Cloneable {
    private String nome;
    private List<Pessoa> filhos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();
    }

    public void adicionarFilho(Pessoa filho) {
        filhos.add(filho);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Filhos: ");
        for (Pessoa filho : filhos) {
            System.out.println("- " + filho.nome);
        }
    }

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        Pessoa clone = (Pessoa) super.clone();
        clone.filhos = new ArrayList<>();
        for (Pessoa filho : this.filhos) {
            clone.adicionarFilho(filho.clone());
        }
        return clone;
    }
}
