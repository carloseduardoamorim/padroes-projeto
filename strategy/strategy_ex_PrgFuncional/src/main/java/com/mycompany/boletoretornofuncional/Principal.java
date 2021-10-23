
package com.mycompany.boletoretornofuncional;



public class Principal {

    public static void main(String[] args) {
        ProcessarBoletos processador = 
                new ProcessarBoletos(ProcessarBoletos::lerBradesco);
        String nomeArquivo = Principal.class.getResource("bradesco-1.csv").getPath();
        System.out.println(nomeArquivo);
        processador.processar(nomeArquivo);
    };
    
}
