
package com.mycompany.exportadordados.simple.factory;

import java.util.function.Function;

/**
 *
 * @author cadua
 */
public class ColunaHtml extends AbstractColuna{
    public ColunaHtml(Function<Produto, Object> obtemValorColuna, String titulo) {
        super(obtemValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "<td>";
    }

    @Override
    public String fechar() {
        return "</td>";
    }
}
