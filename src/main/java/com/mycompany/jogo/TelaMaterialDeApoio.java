/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
public class TelaMaterialDeApoio extends javax.swing.JFrame {

    /**
     * Creates new form TelaMaterialDeApoio
     */
    public TelaMaterialDeApoio() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMaterialDeApoio = new javax.swing.JPanel();
        botaoMaterialInput = new javax.swing.JButton();
        botaoMaterialIfElifElse = new javax.swing.JButton();
        botaoMaterialDef = new javax.swing.JButton();
        botaoMaterialWhile = new javax.swing.JButton();
        botaoMaterialFor = new javax.swing.JButton();
        botaoMaterialList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelMaterialDeApoio.setBackground(new java.awt.Color(0, 0, 45));
        painelMaterialDeApoio.setPreferredSize(new java.awt.Dimension(1128, 780));

        botaoMaterialInput.setBackground(new java.awt.Color(0, 0, 45));
        botaoMaterialInput.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        botaoMaterialInput.setForeground(new java.awt.Color(187, 187, 187));
        botaoMaterialInput.setText("Input");
        botaoMaterialInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaterialInputActionPerformed(evt);
            }
        });

        botaoMaterialIfElifElse.setBackground(new java.awt.Color(0, 0, 45));
        botaoMaterialIfElifElse.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        botaoMaterialIfElifElse.setForeground(new java.awt.Color(187, 187, 187));
        botaoMaterialIfElifElse.setText("If Elif Else");
        botaoMaterialIfElifElse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaterialIfElifElseActionPerformed(evt);
            }
        });

        botaoMaterialDef.setBackground(new java.awt.Color(0, 0, 45));
        botaoMaterialDef.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        botaoMaterialDef.setForeground(new java.awt.Color(187, 187, 187));
        botaoMaterialDef.setText("Def");
        botaoMaterialDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaterialDefActionPerformed(evt);
            }
        });

        botaoMaterialWhile.setBackground(new java.awt.Color(0, 0, 45));
        botaoMaterialWhile.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        botaoMaterialWhile.setForeground(new java.awt.Color(187, 187, 187));
        botaoMaterialWhile.setText("While");
        botaoMaterialWhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaterialWhileActionPerformed(evt);
            }
        });

        botaoMaterialFor.setBackground(new java.awt.Color(0, 0, 45));
        botaoMaterialFor.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        botaoMaterialFor.setForeground(new java.awt.Color(187, 187, 187));
        botaoMaterialFor.setText("For");
        botaoMaterialFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaterialForActionPerformed(evt);
            }
        });

        botaoMaterialList.setBackground(new java.awt.Color(0, 0, 45));
        botaoMaterialList.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        botaoMaterialList.setForeground(new java.awt.Color(187, 187, 187));
        botaoMaterialList.setText("List");
        botaoMaterialList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaterialListActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 45));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1.setText("Material de Apoio");

        jButton1.setBackground(new java.awt.Color(0, 0, 45));
        jButton1.setForeground(new java.awt.Color(0, 0, 45));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\bVoltar.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMaterialDeApoioLayout = new javax.swing.GroupLayout(painelMaterialDeApoio);
        painelMaterialDeApoio.setLayout(painelMaterialDeApoioLayout);
        painelMaterialDeApoioLayout.setHorizontalGroup(
            painelMaterialDeApoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaterialDeApoioLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(painelMaterialDeApoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoMaterialFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoMaterialDef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoMaterialInput, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelMaterialDeApoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoMaterialIfElifElse, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(botaoMaterialWhile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoMaterialList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMaterialDeApoioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(427, 427, 427))
        );
        painelMaterialDeApoioLayout.setVerticalGroup(
            painelMaterialDeApoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaterialDeApoioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelMaterialDeApoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(painelMaterialDeApoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoMaterialInput, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMaterialIfElifElse, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(painelMaterialDeApoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoMaterialWhile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoMaterialDef, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addGap(88, 88, 88)
                .addGroup(painelMaterialDeApoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoMaterialList, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(botaoMaterialFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(painelMaterialDeApoio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMaterialDeApoio, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMaterialInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaterialInputActionPerformed
        new TelaMaterialInput().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoMaterialInputActionPerformed

    private void botaoMaterialDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaterialDefActionPerformed
        new TelaMaterialDef().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoMaterialDefActionPerformed

    private void botaoMaterialIfElifElseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaterialIfElifElseActionPerformed
        new TelaMaterialIfElifElse().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoMaterialIfElifElseActionPerformed

    private void botaoMaterialWhileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaterialWhileActionPerformed
        new TelaMaterialWhile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoMaterialWhileActionPerformed

    private void botaoMaterialForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaterialForActionPerformed
        new TelaMaterialFor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoMaterialForActionPerformed

    private void botaoMaterialListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaterialListActionPerformed
        new TelaMaterialList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoMaterialListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMaterialDeApoio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMaterialDeApoio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMaterialDeApoio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMaterialDeApoio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMaterialDeApoio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMaterialDef;
    private javax.swing.JButton botaoMaterialFor;
    private javax.swing.JButton botaoMaterialIfElifElse;
    private javax.swing.JButton botaoMaterialInput;
    private javax.swing.JButton botaoMaterialList;
    private javax.swing.JButton botaoMaterialWhile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painelMaterialDeApoio;
    // End of variables declaration//GEN-END:variables
}