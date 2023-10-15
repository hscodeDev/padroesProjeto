package estruturais.composite.composite;

public class Main {
    public static void main(String[] args) {
        Component funcionario1 = new Funcionario("Alice", 5000);
        Component funcionario2 = new Funcionario("Bob", 6000);
        Component funcionario3 = new Funcionario("Charlie", 5500);

        Departamento departamentoTI = new Departamento("Departamento de TI");
        Departamento departamentoVendas = new Departamento("Departamento de Vendas");
        Departamento departamentoGeral = new Departamento("Departamento Geral");

        departamentoTI.adicionarMembro(funcionario1);
        departamentoTI.adicionarMembro(funcionario2);

        departamentoVendas.adicionarMembro(funcionario3);

        departamentoGeral.adicionarMembro(departamentoTI);
        departamentoGeral.adicionarMembro(departamentoVendas);

        double despesasTotais = departamentoGeral.calcularDespesas();
        System.out.println("Despesas totais da empresa: R$" + despesasTotais);
    }
}
