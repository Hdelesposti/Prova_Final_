package br.com.pss.provaf.pss_prova_final.observer;

public interface Observado {
    void adicionarObservador(Observador o);
    void removerObservador(Observador o);
    void notificarObservadores();
}
