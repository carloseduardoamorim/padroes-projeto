
package com.mycompany.boletoretornostrategy;

public class Principal {

    public static void main(String[] args) {
        final ProcessarBoletos processarBoletos = 
                new ProcessarBoletos(new LeituraRetornoBancoBrasil());
        String nomeArquivo = 
                Principal.class.getResource("banco-brasil-1.csv").getPath();
        System.out.println("Lendo arquivo " + nomeArquivo + "\n");
        
        processarBoletos.processar(nomeArquivo);
    }
    
}
