package estruturais.composite.codigosemaplicar;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Alice", 5000);
        Funcionario funcionario2 = new Funcionario("Bob", 6000);
        Funcionario funcionario3 = new Funcionario("Charlie", 5500);

        Departamento departamentoTI = new Departamento("Departamento de TI");
        departamentoTI.adicionarFuncionario(funcionario1);
        departamentoTI.adicionarFuncionario(funcionario2);

        Departamento departamentoVendas = new Departamento("Departamento de Vendas");
        departamentoVendas.adicionarFuncionario(funcionario3);

        Departamento departamentoGeral = new Departamento("Departamento Geral");
        departamentoGeral.adicionarSubdepartamento(departamentoTI);
        departamentoGeral.adicionarSubdepartamento(departamentoVendas);

        double despesasTotais = departamentoGeral.calcularDespesas();
        System.out.println("Despesas totais da empresa: R$" + despesasTotais);
    }
}
