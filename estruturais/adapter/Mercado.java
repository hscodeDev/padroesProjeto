package estruturais.adapter;

public class Mercado {
    public void realizarCompra(double valor, Pagamento pagamento) {
        pagamento.pagarEmDinheiro(valor);
    }
}