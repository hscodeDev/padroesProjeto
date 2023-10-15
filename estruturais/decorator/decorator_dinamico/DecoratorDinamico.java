package estruturais.decorator.decorator_dinamico;

import java.util.function.Consumer;

public class DecoratorDinamico {
    static Notebook adicionarFuncionalidade(Notebook notebook, Consumer<Notebook> decorator) {
        decorator.accept(notebook);
        return notebook;
    }
}
