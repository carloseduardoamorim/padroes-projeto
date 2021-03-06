
package com.mycompany.exportadordados.simple.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cadua
 */
public class Principal {

    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "TV", "LG", "1234-a", 1200));
        produtos.add(new Produto(2, "Geladeira", "Electrolux", "Delux", 400));
        produtos.add(new Produto(3, "Notebook", "Asus", "Predator", 850));
        
        ExportadorListaProduto exportadorMd = ExportadorListaProduto.newInstance("md");
        exportadorMd.addNewColuna(Principal::precoComDesconto, "Preço com Desconto");

        ExportadorListaProduto exportadorHtml = ExportadorListaProduto.newInstance("html");
        exportadorHtml.addNewColuna(Principal::precoComDesconto, "Preço com Desconto");

        System.out.println(exportadorMd.exportar(produtos));
        System.out.println(exportadorHtml.exportar(produtos));
    }

    private static double precoComDesconto(Produto produto){
        return produto.getPreco() * 0.9;
    }
}
