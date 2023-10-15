import criacionais.builder.builder.Casa;

public class Main {
    public static void main(String[] args) {



        //Código sem aplicar Factory Method
/*        Pao paoFrances = new Pao("Pão Francês");
        Pao paoIntegral = new Pao("Pão integral");
        Pao paoCenteio = new Pao("Pão de Centeio");
        System.out.printf("Pão Criado" + paoFrances.getDescricao());
        System.out.println("\n");
        System.out.printf("Pão Criado" + paoIntegral.getDescricao());
        System.out.println("\n");
        System.out.printf("Pão Criado" + paoCenteio.getDescricao());*/

        // Builder
/*        CasaBuilder construtor = new ConstrutorDeCasa();
        Diretor diretor = new Diretor();
        Casa minhaCasa = diretor.construirCasa(construtor);

        System.out.println("Minha Casa: " + minhaCasa);*/

        //Código sem Aplicar o Builder
        Casa minhaCasa = new Casa(3, "Telhado de cerâmica", "Branco");
        System.out.println("Minha Casa: " + minhaCasa);
    }
}