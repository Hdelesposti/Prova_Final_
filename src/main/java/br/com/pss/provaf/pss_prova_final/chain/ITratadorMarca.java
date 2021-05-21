package br.com.pss.provaf.pss_prova_final.chain;

public interface ITratadorMarca {
    boolean aceitar(String texto);
    
    String processar(String texto) throws Exception;
}
