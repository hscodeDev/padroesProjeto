package criacionais.prototype.prototyperegistrado;

import java.util.HashMap;
import java.util.Map;

public class RegistroPessoa {
    private Map<String, Pessoa> prototipos = new HashMap<>();

    public RegistroPessoa() {
        prototipos.put("pessoaPadrao", new Pessoa("João"));
        prototipos.put("pessoaEspecial", new Pessoa("Maria"));
    }

    public Pessoa getPrototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}
