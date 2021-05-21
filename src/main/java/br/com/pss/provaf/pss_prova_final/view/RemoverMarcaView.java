package br.com.pss.provaf.pss_prova_final.view;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;

public class RemoverMarcaView extends javax.swing.JFrame {

    /**
     * Creates new form RemoverMarcaView
     */
    public RemoverMarcaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneTextoProcessado = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneTextoOriginal = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListMarcas = new javax.swing.JList<>();
        jButtonDeletarMarca = new javax.swing.JButton();
        jButtonProcessarTexto1 = new javax.swing.JButton();
        jButtonAddMarca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Removedor de nome de empresas (marcas)");

        jScrollPane1.setViewportView(jTextPaneTextoProcessado);

        jScrollPane2.setViewportView(jTextPaneTextoOriginal);

        jListMarcas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListMarcas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListMarcas.setPreferredSize(new java.awt.Dimension(49, 120));
        jScrollPane3.setViewportView(jListMarcas);

        jButtonDeletarMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeletarMarca.setText("Deletar");
        jButtonDeletarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarMarcaActionPerformed(evt);
            }
        });

        jButtonProcessarTexto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonProcessarTexto1.setText("Processar texto");
        jButtonProcessarTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcessarTexto1ActionPerformed(evt);
            }
        });

        jButtonAddMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAddMarca.setText("Adicionar");
        jButtonAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMarcaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Texto processado:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Texto orignal:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Marcas (nomes) que serão removidas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jButtonDeletarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButtonProcessarTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDeletarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonProcessarTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeletarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeletarMarcaActionPerformed

    private void jButtonProcessarTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcessarTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProcessarTexto1ActionPerformed

    private void jButtonAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddMarcaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMarca;
    private javax.swing.JButton jButtonDeletarMarca;
    private javax.swing.JButton jButtonProcessarTexto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListMarcas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPaneTextoOriginal;
    private javax.swing.JTextPane jTextPaneTextoProcessado;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonAddMarca() {
        return jButtonAddMarca;
    }

    public JButton getjButtonDeletarMarca() {
        return jButtonDeletarMarca;
    }

    public JButton getjButtonProcessarTexto1() {
        return jButtonProcessarTexto1;
    }

    public JList<String> getjListMarcas() {
        return jListMarcas;
    }

    public JTextPane getjTextPaneTextoOriginal() {
        return jTextPaneTextoOriginal;
    }

    public JTextPane getjTextPaneTextoProcessado() {
        return jTextPaneTextoProcessado;
    }
}
