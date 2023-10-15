package criacionais.builder.builder;

public class Main {
    public static void main(String[] args) {
        CasaBuilder construtor = new ConstrutorDeCasa();
        Diretor diretor = new Diretor();

        Casa minhaCasa = diretor.construirCasa(construtor);
        System.out.println("Minha Casa: " + minhaCasa);
    }
}
