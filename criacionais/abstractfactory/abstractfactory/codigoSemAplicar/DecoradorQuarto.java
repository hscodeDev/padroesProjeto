package criacionais.abstractfactory.abstractfactory.codigoSemAplicar;

public class DecoradorQuarto {
    private Cama cama;
    private MesaCabeceira mesaCabeceira;
    private GuardaRoupa guardaRoupa;
    public DecoradorQuarto(String estilo){
        this.cama = new Cama(estilo);
        this.mesaCabeceira = new MesaCabeceira(estilo);
        this.guardaRoupa = new GuardaRoupa(estilo);
    }
    public void mostarMobilia(){
        System.out.println("Mobília do quarto:");
        System.out.println("Cama: "+ this.cama.getEstilo());
        System.out.println("Mesa de cabeceira: "+ this.mesaCabeceira.getEstilo());
        System.out.println("Guarda Roupa: "+ this.guardaRoupa.getEstilo());
    }
}
