package br.com.pss.provaf.pss_prova_final.presenter;

import br.com.pss.provaf.pss_prova_final.chain.ProcessadoraTexto;
import br.com.pss.provaf.pss_prova_final.chain.RemovedorMarca;
import br.com.pss.provaf.pss_prova_final.collections.MarcasCollection;
import br.com.pss.provaf.pss_prova_final.observer.Observador;
import br.com.pss.provaf.pss_prova_final.view.RemoverMarcaView;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public final class RemoverMarcaPresenter implements Observador{
    
    private RemoverMarcaView view;
    private MarcasCollection marcasCollection;
    private List<String> marcas;
    private ProcessadoraTexto processadora;

    public RemoverMarcaPresenter() {
        this.configurarTela();
    }
    
    private void configurarTela() {
        this.marcasCollection = MarcasCollection.getInstance();
        this.marcasCollection.adicionarObservador(this);
        this.marcas = this.marcasCollection.getMarcas();
        this.processadora = ProcessadoraTexto.getInstance();
        this.view = new RemoverMarcaView();
        
        this.view.getjTextPaneTextoProcessado().setEditable(false);
        
        atualizar();
        
        this.view.getjButtonProcessarTexto1().addActionListener(l -> {
            try {
                processarTexto();
            } catch (Exception ex) {
                //Logger.getLogger(RemoverMarcaPresenter.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this.view, "<html><body>"
                    + "<h3>"
                    + "<font face='Arial'>" + ex.getMessage() + "</font>"
                    + "</h3>"
                    + "</body></html>", "MENSAGEM", 1);
            }
        });
        
        this.view.getjButtonDeletarMarca().addActionListener(l -> {
            try {
                deletarMarca();
            } catch (Exception ex) {
                //Logger.getLogger(RemoverMarcaPresenter.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this.view, "<html><body>"
                    + "<h3>"
                    + "<font face='Arial'>" + ex.getMessage() + "</font>"
                    + "</h3>"
                    + "</body></html>", "MENSAGEM", 1);
            }
        });
        
        this.view.getjButtonAddMarca().addActionListener(l -> {
            new AddMarcaPresenter();
        });
        
        this.view.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                view.setLocationRelativeTo(null);
            }
            
        });
        
        this.view.setResizable(false);
        this.view.setVisible(true);
    }
    
    private void preencherListagem() {
        this.view.getjListMarcas().removeAll();
        
        DefaultListModel model = new DefaultListModel();
        
        Iterator<String> it = this.marcas.iterator();
        while (it.hasNext()) {
             model.addElement(it.next());
        }
        this.view.getjListMarcas().setModel(model);
    }

    @Override
    public void atualizar() {
        this.view.getjTextPaneTextoProcessado().setText("");
        preencherListagem();
    }

    private void processarTexto() throws Exception {
        if (this.view.getjListMarcas().isSelectionEmpty()) {
            throw new Exception("Selecione uma marca para continuar");
        }
        
        String texto = this.view.getjTextPaneTextoOriginal().getText();

        String marca = this.view.getjListMarcas().getSelectedValue(); 
        
        this.processadora.addTratador(new RemovedorMarca(marca));
        
        String textoProcessado = this.processadora.processarTexto(texto);
        
        this.view.getjTextPaneTextoProcessado().setText(textoProcessado);
        
    }

    private void deletarMarca() throws Exception {
        if (this.view.getjListMarcas().isSelectionEmpty()) {
            throw new Exception("Selecione uma marca para continuar");
        }
        
        String marca = this.view.getjListMarcas().getSelectedValue();
        
        this.marcasCollection.removerMarca(marca);
        this.processadora.removerTratadores();
    }
}
