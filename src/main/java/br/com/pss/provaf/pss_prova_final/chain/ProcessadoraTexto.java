package br.com.pss.provaf.pss_prova_final.chain;

import java.util.ArrayList;
import java.util.List;

public final class ProcessadoraTexto {
    
    private static ProcessadoraTexto INSTANCE = null;
    private final List<ITratadorMarca> tratadores = new ArrayList();

    private ProcessadoraTexto() {
    }
    
    public static ProcessadoraTexto getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProcessadoraTexto();
        }
        return INSTANCE;
    }
    
    public void addTratador(ITratadorMarca tratador) throws Exception {
        if (tratador != null) {
            this.tratadores.add(tratador);
        } else {
            throw new Exception("É preciso informar um tratador válido");
        }
    }
    
    public void removerTratadores() {
       this.tratadores.clear();
    }
    
    public String processarTexto(String texto) throws Exception {
        for (ITratadorMarca tratador : this.tratadores) {
            if (tratador.aceitar(texto)) {
                texto = tratador.processar(texto);
            }
        }
        return texto;
    }
}
