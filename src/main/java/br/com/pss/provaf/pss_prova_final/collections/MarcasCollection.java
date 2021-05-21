package br.com.pss.provaf.pss_prova_final.collections;

import br.com.pss.provaf.pss_prova_final.observer.Observado;
import br.com.pss.provaf.pss_prova_final.observer.Observador;
import java.util.ArrayList;
import java.util.List;

public final class MarcasCollection implements Observado{
    
    private List<String> marcas;
    private List<Observador> observadores;
    private static MarcasCollection INSTANCE = null;

    private MarcasCollection() {
        this.marcas = new ArrayList();
        this.observadores = new ArrayList();
        popularMarcas();
    }
    
    public static MarcasCollection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MarcasCollection();
        }
        return INSTANCE;
    }
    
    public void addMarca(String marca) throws Exception {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Informe uma marca válida");
        }
        
        if (!this.marcas.contains(marca)) {
            this.marcas.add(marca);
            notificarObservadores();
        }
    }
    
    public void removerMarca(String marca) {
       if (marca != null || !marca.isEmpty()) {
            this.marcas.remove(marca);
            notificarObservadores();
        } 
    }

    public List<String> getMarcas() {
        return marcas;
    }  

    @Override
    public void adicionarObservador(Observador o) {
        if (!this.observadores.contains(o)) {
            this.observadores.add(o);
        }
    }

    @Override
    public void removerObservador(Observador o) {
        this.observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        this.observadores.forEach(o -> o.atualizar());
    }

    private void popularMarcas() {
        this.marcas.add("Apple");
        this.marcas.add("Facebook");
        this.marcas.add("Google");
        this.marcas.add("Amazon");
        this.marcas.add("UFES");
    }
}
