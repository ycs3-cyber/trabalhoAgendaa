/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Controller.ControllerAgenda;
import Model.ModelAgendamento;

/**
 *
 * @author Pichau
 */
public class CardAgendamento extends javax.swing.JPanel {

    private int id;
    private Runnable onChange;


   public CardAgendamento(
        int id,
        String titulo,
        String descricao,
        String dataHora,
        boolean finalizado,
        Runnable onChange
) {
    initComponents();
    this.id = id;
    this.onChange = onChange;

    jLabelTitulo.setText(titulo);
    jLabelDescricao.setText(descricao);
    jLabelDataHora.setText(dataHora);
    jCheckBox2.setSelected(finalizado);
}


  

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDataHora = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButtonApagar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jButton2.setText("jButton1");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTitulo.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(31, 41, 51));
        jLabelTitulo.setText("jLabel1");

        jLabelDataHora.setBackground(new java.awt.Color(153, 153, 153));
        jLabelDataHora.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabelDataHora.setForeground(new java.awt.Color(107, 114, 128));
        jLabelDataHora.setText("22/02/2025 11:50");

        jLabelDescricao.setBackground(new java.awt.Color(153, 153, 153));
        jLabelDescricao.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(107, 114, 128));
        jLabelDescricao.setText("Descrição");

        jCheckBox2.setForeground(new java.awt.Color(55, 65, 81));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jButtonApagar.setBackground(new java.awt.Color(220, 38, 38));
        jButtonApagar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButtonApagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApagar.setText("Apagar");
        jButtonApagar.setBorder(null);
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(99, 102, 241));
        jButtonEditar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setBorder(null);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDataHora))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jCheckBox2)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelDataHora))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescricao)
                            .addComponent(jCheckBox2))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        int resp = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Deseja realmente apagar este agendamento?",
            "Confirmar exclusão",
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.WARNING_MESSAGE
    );

    if (resp != javax.swing.JOptionPane.YES_OPTION) {
        return; // usuário cancelou
    }

    boolean ok = new Controller.ControllerAgenda().deletarAgenda(id);

    if (ok) {
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Agendamento apagado com sucesso!",
                "Sucesso",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );

        if (onChange != null) onChange.run(); // recarrega a lista
    } else {
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Não foi possível apagar o agendamento.",
                "Erro",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );
    }

    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
         java.awt.Frame frame = (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this);

    ViewAgendamentoEditar dlg = new ViewAgendamentoEditar(frame, true, this.id, () -> {
        if (onChange != null) onChange.run(); // recarrega a lista
    });

    dlg.setLocationRelativeTo(frame);
    dlg.setVisible(true);

    }//GEN-LAST:event_jButtonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabelDataHora;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
