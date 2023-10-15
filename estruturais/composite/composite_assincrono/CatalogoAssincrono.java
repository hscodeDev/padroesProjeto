package estruturais.composite.composite_assincrono;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CatalogoAssincrono {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Future<Double> calcularTotalAssincrono() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> resultado = executorService.submit(new Callable<Double>() {
            public Double call() {
                double total = 0;
                for (Produto produto : produtos) {
                    total += produto.getPreco();
                }
                return total;
            }
        });
        executorService.shutdown();
        return resultado;
    }
}