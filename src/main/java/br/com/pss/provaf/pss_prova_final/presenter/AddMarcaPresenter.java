package br.com.pss.provaf.pss_prova_final.presenter;

import br.com.pss.provaf.pss_prova_final.collections.MarcasCollection;
import br.com.pss.provaf.pss_prova_final.view.AddMarcaView;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;

public final class AddMarcaPresenter {
    
    private AddMarcaView view;
    private MarcasCollection marcasCollection;

    public AddMarcaPresenter() {
        configurarTela();
    }
    
    private void configurarTela() {
        this.marcasCollection = MarcasCollection.getInstance();
        this.view = new AddMarcaView();
        
        this.view.getjButtonAddMarca().addActionListener(l -> {
            salvarMarca();
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

    private void salvarMarca() {
        String marca = this.view.getjTextFieldMarca().getText();
        
        System.out.println("Marca: " + marca);
        
        try {
            this.marcasCollection.addMarca(marca);
        } catch (Exception ex) {
            //Logger.getLogger(AddMarcaPresenter.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this.view, "<html><body>"
                    + "<h3>"
                    + "<font face='Arial'>" + ex.getMessage() + "</font>"
                    + "</h3>"
                    + "</body></html>", "MENSAGEM", 1);
        }
        
        this.view.getjTextFieldMarca().setText("");
    }
}
