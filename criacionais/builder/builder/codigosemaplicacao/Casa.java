package criacionais.builder.builder.codigosemaplicacao;

public class Casa {
    private int numeroQuartos;
    private String tipoTelhado;
    private String corParedes;

    public Casa(int numeroQuartos, String tipoTelhado, String corParedes) {
        this.numeroQuartos = numeroQuartos;
        this.tipoTelhado = tipoTelhado;
        this.corParedes = corParedes;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public String getTipoTelhado() {
        return tipoTelhado;
    }

    public void setTipoTelhado(String tipoTelhado) {
        this.tipoTelhado = tipoTelhado;
    }

    public String getCorParedes() {
        return corParedes;
    }

    public void setCorParedes(String corParedes) {
        this.corParedes = corParedes;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numeroQuartos=" + numeroQuartos +
                ", tipoTelhado='" + tipoTelhado + '\'' +
                ", corParedes='" + corParedes + '\'' +
                '}';
    }
}
