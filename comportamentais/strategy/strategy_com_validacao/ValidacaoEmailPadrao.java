package comportamentais.strategy.strategy_com_validacao;

public class ValidacaoEmailPadrao implements EstrategiaValidacaoEmail {
    public boolean validar(String email) {
        return email.contains("@");
    }
}
