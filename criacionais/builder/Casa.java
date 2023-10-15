package criacionais.builder;

public class Casa {
    private String estrutura;
    private String telhado;
    private String paredes;

    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public String getTelhado() {
        return telhado;
    }

    public void setTelhado(String telhado) {
        this.telhado = telhado;
    }

    public String getParedes() {
        return paredes;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "estrutura='" + estrutura + '\'' +
                ", telhado='" + telhado + '\'' +
                ", paredes='" + paredes + '\'' +
                '}';
    }
}
