package estruturais.adapter;

import estruturais.adapter.adapterDeClasse.AdaptadorDeClasseCartaoCredito;
import estruturais.adapter.adapterDeObjeto.AdaptadorDeObjetoCartaoCredito;

public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        // Pagamento em dinheiro
        System.out.println("Realizando compra em dinheiro:");
        mercado.realizarCompra(50.0, new Pagamento() {
            @Override
            public void pagarEmDinheiro(double valor) {
                System.out.println("Pagamento em dinheiro: R$" + valor);
            }
        });

        // Pagamento com Adapter de Classe (Class Adapter)
        System.out.println("\nRealizando compra com cartão de crédito (Adapter de Classe):");
        mercado.realizarCompra(100.0, new AdaptadorDeClasseCartaoCredito());

        // Pagamento com Adapter de Objeto (Object Adapter)
        System.out.println("\nRealizando compra com cartão de crédito (Adapter de Objeto):");
        mercado.realizarCompra(75.0, new AdaptadorDeObjetoCartaoCredito());
    }
}
