package br.com.pss.provaf.pss_prova_final.chain;

import br.com.pss.provaf.pss_prova_final.utils.UtilitarioString;

public class RemovedorMarca implements ITratadorMarca {

    private final String marca;

    public RemovedorMarca(String stringTratada) {
        this.marca = stringTratada;
    }

    @Override
    public boolean aceitar(String texto) {
        return texto.contains(this.marca);
    }

    @Override
    public String processar(String texto) throws Exception {
        return UtilitarioString.getInstance().substitui(texto, marca, "*");
    }
    
}
