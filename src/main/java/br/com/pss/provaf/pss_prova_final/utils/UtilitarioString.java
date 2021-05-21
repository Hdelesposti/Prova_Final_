package br.com.pss.provaf.pss_prova_final.utils;

public final class UtilitarioString {
    
    private static UtilitarioString INSTANCE = null;
    
    private UtilitarioString() {}
    
    public static UtilitarioString getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UtilitarioString();
        }
        return INSTANCE;
    }
    
    public String substitui(String texto, String marca, CharSequence simbolo) throws Exception {
        validarArgumentos(texto, marca, simbolo);
        
        String novaString = getNovaString(marca, simbolo);
        
        return texto.replaceAll(marca, novaString);
    }

    private void validarArgumentos(String texto, String marca, CharSequence simbolo) throws Exception {
        if (texto == null || texto.isEmpty() || texto.isBlank()) {
            throw new Exception("Informe o texto que será processado");
        }
        
        if (marca == null || marca.isEmpty()) {
            throw new Exception("Informe a marca a ser removida do texto");
        }
        
        if (simbolo.length() == 0) {
            throw new Exception("Informe o simbolo");
        }
        
        if (simbolo.length() > 1) {
            throw new Exception("O símbolo só pode ter um caracter");
        }
    }

    private String getNovaString(String marca, CharSequence simbolo) {   
        return simbolo.toString().repeat(marca.length());
    }
}
