package criacionais.factorymethod.factorymethod;


import criacionais.factorymethod.factorymethod.factory.FabricaDePao;
import criacionais.factorymethod.factorymethod.factory.FabricaDePaoFrances;
import criacionais.factorymethod.factorymethod.factory.FabricaPaoCenteio;
import criacionais.factorymethod.factorymethod.factory.FabricaPaoIntegral;
import criacionais.factorymethod.factorymethod.models.Pao;

public class Main {
    public static void main(String[] args) {
        FabricaDePaoFrances fabricaDePaoFrances = new FabricaDePaoFrances();
        Pao paoFrances = fabricaDePaoFrances.criarPao();
        System.out.println("Pão Criado: " + paoFrances.getDescricao());

        FabricaPaoIntegral fabricaDePaoIntegral = new FabricaPaoIntegral();
        Pao paoIntegral = fabricaDePaoIntegral.criarPao();
        System.out.println("Pão Criado: " + paoIntegral.getDescricao());

        FabricaDePao fabricaPaoCenteio = new FabricaPaoCenteio();
        Pao paoCenteio = fabricaPaoCenteio.criarPao();
        System.out.println("Pão Criado: " + paoCenteio.getDescricao());
    }
}