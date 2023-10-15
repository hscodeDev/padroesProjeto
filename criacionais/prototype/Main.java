package criacionais.prototype;


import criacionais.prototype.prototyperegistrado.Pessoa;
import criacionais.prototype.prototyperegistrado.RegistroPessoa;

public class Main {
    public static void main(String[] args) {

        //Prototype Registrado:
        try {
            RegistroPessoa registro = new RegistroPessoa();

            Pessoa pessoaPadrao = null;
            pessoaPadrao = registro.getPrototipo("pessoaPadrao");
            Pessoa pessoaEspecial = registro.getPrototipo("pessoaEspecial");

            pessoaPadrao.exibirNome();
            pessoaEspecial.exibirNome();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        //Prototype Gerado por Clonagem Profunda
//        try {
//            List<String> hobbies = new ArrayList<>();
//            hobbies.add("Leitura");
//            hobbies.add("Caminhada");
//
//            Pessoa pessoaOriginal = new Pessoa("Alice", hobbies);
//            Pessoa pessoaClone = null;
//            pessoaClone = pessoaOriginal.clone();
//            pessoaOriginal.exibirInfo();
//            pessoaClone.exibirInfo();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }

        //Prototype em Árvore
//        try {
//            Pessoa avo = new Pessoa("Avo");
//            Pessoa pai = new Pessoa("Pai");
//            Pessoa filho1 = new Pessoa("Filho 1");
//            Pessoa filho2 = new Pessoa("Filho 2");
//
//            avo.adicionarFilho(pai);
//            pai.adicionarFilho(filho1);
//            pai.adicionarFilho(filho2);
//            Pessoa copiaAvo = avo.clone();
//            System.out.println("Árvore original:");
//            avo.exibirInfo();
//
//            System.out.println("Cópia da árvore:");
//            copiaAvo.exibirInfo();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }


    }
}
