
package com.mycompany.exportadordados.simple.factory;

import java.util.List;

public interface ExportadorListaProduto {

    
    String abrirTabela();
    String fecharTabela();
    String abrirLinha();
    String fecharLinha();
    String fecharLinhsTitulos();
    String abrirColuna(String valor);
    String fecharColuna();
    String exportar(List<Produto> listaProdutos);
    
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
