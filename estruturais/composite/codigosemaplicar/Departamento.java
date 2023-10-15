package estruturais.composite.codigosemaplicar;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Departamento> subdepartamentos = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarSubdepartamento(Departamento subdepartamento) {
        subdepartamentos.add(subdepartamento);
    }

    public double calcularDespesas() {
        double despesas = 0;

        for (Funcionario funcionario : funcionarios) {
            despesas += funcionario.getSalario();
        }

        for (Departamento subdepartamento : subdepartamentos) {
            despesas += subdepartamento.calcularDespesas();
        }

        return despesas;
    }
}
