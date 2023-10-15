package estruturais.facade;

public class AutomacaoResidencialFacade {
    private Luzes luzes;
    private Climatizacao climatizacao;
    private Seguranca seguranca;

    public AutomacaoResidencialFacade() {
        this.luzes = new Luzes();
        this.climatizacao = new Climatizacao();
        this.seguranca = new Seguranca();
    }

    public void ligarCasa() {
        luzes.ligar();
        climatizacao.ligarArCondicionado();
        seguranca.ativarAlarme();
    }

    public void desligarCasa() {
        luzes.desligar();
        climatizacao.desligarArCondicionado();
        seguranca.desativarAlarme();
    }
}
