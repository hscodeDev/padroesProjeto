package estruturais.composite.composite;

public class Funcionario implements Component{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double calcularDespesas() {
        return salario;
    }
}
