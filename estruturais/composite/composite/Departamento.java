package estruturais.composite.composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Component{
    private String nome;
    private List<Component> membros = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarMembro(Component membro) {
        membros.add(membro);
    }

    @Override
    public double calcularDespesas() {
        double despesas = 0;
        for (Component membro : membros) {
            despesas += membro.calcularDespesas();
        }
        return despesas;
    }
}
