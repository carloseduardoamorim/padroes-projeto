
package com.mycompany.exportadordados.simple.factory;

import java.util.List;
import java.util.function.Function;

public interface ExportadorListaProduto {
    
    String abrirTabela();
    String fecharTabela();
    String abrirLinha();
    String fecharLinha();
    String fecharLinhaTitulos();
    String exportar(List<Produto> produtos);
    void addNewColuna(Function<Produto, Object> obtemValorColuna, String titulo);
    
    static ExportadorListaProduto newInstance(){
        return newInstance("html");
    }
    
    static ExportadorListaProduto newInstance(String extensaoArq){
        switch(extensaoArq){
            case "html":
                return new ExportadorListaProdutoHtml();
            case "md":
                return new ExportadorListaProdutoMarkdown();
            default:
                throw new UnsupportedOperationException("Formato de arquivo não suportado: " + extensaoArq);
                
        }
    }
}
