package comportamentais.strategy.strategy_com_validacao;

public class Main {
    public static void main(String[] args) {
        EstrategiaValidacaoEmail validacaoPadrao = new ValidacaoEmailPadrao();
        EstrategiaValidacaoEmail validacaoPersonalizada = new ValidacaoEmailPersonalizada();

        String email1 = "usuario@example.com";
        String email2 = "outro@email.com";

        System.out.println("Email 1 é válido? " + validacaoPadrao.validar(email1));
        System.out.println("Email 2 é válido? " + validacaoPersonalizada.validar(email2));
    }
}
