package criacionais.singleton.enumSingleton;

public enum RestauranteEnum {
    INSTANCIA("Restaurante Exclusivo");

    private String nome;

    private RestauranteEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
