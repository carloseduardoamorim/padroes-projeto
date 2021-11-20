
package com.mycompany.exportadordados.simple.factory;

import java.util.function.Function;

/**
 *
 * @author cadua
 */
public class ColunaMarkdown extends AbstractColuna{
    public ColunaMarkdown(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return " | ";
    }

    @Override
    public String fechar() {
        return "";
    }
}
