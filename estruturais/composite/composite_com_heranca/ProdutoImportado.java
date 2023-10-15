package estruturais.composite.composite_com_heranca;

class ProdutoImportado extends Produto {
    private double taxaImportacao;

    public ProdutoImportado(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public double getPreco() {
        return super.getPreco() + taxaImportacao;
    }
}
