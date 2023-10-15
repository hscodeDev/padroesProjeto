package comportamentais.strategy.strategy_com_validacao;

public class ValidacaoEmailPersonalizada implements EstrategiaValidacaoEmail {
    public boolean validar(String email) {
        // Implementação de validação personalizada
        return email.endsWith(".com");
    }
}
