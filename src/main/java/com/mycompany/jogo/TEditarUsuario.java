package com.mycompany.jogo;

import javax.swing.JOptionPane;

public class TEditarUsuario extends javax.swing.JFrame {

    public TEditarUsuario() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEditarUsuario = new javax.swing.JPanel();
        bEditar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        iconNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        iconEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        iconIdade = new javax.swing.JLabel();
        textIdade = new javax.swing.JTextField();
        iconTelefone = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        iconUsuario = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        idadeLabel = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        nomeUsuarioLabel = new javax.swing.JLabel();
        iconSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelEditarUsuario.setBackground(new java.awt.Color(0, 0, 45));

        bEditar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        bEditar.setText("Aplicar alterações");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bCancelar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        iconNome.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\name.png")); // NOI18N

        textNome.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        iconEmail.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\email.png")); // NOI18N
        iconEmail.setText("jLabel2");

        textEmail.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        iconIdade.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\age.png")); // NOI18N
        iconIdade.setText("jLabel3");

        textIdade.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        iconTelefone.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\phone.png")); // NOI18N
        iconTelefone.setText("jLabel4");

        textTelefone.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        iconUsuario.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\Usuario.png")); // NOI18N
        iconUsuario.setText("jLabel5");

        textUsuario.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N

        nomeLabel.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("Nome");

        emailLabel.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("E-mail");

        idadeLabel.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        idadeLabel.setForeground(new java.awt.Color(255, 255, 255));
        idadeLabel.setText("Idade");

        telefoneLabel.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        telefoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        telefoneLabel.setText("Telefone");

        nomeUsuarioLabel.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        nomeUsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeUsuarioLabel.setText("Nome de usuário");

        iconSenha.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\Cadeado.png")); // NOI18N
        iconSenha.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha");

        javax.swing.GroupLayout painelEditarUsuarioLayout = new javax.swing.GroupLayout(painelEditarUsuario);
        painelEditarUsuario.setLayout(painelEditarUsuarioLayout);
        painelEditarUsuarioLayout.setHorizontalGroup(
            painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEditarUsuarioLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEditarUsuarioLayout.createSequentialGroup()
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEditarUsuarioLayout.createSequentialGroup()
                        .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(iconIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(iconTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(iconUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEditarUsuarioLayout.createSequentialGroup()
                        .addComponent(iconSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painelEditarUsuarioLayout.createSequentialGroup()
                                    .addComponent(nomeUsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(377, 377, 377))
                                .addComponent(textSenha)))))
                .addGap(311, 311, 311))
        );
        painelEditarUsuarioLayout.setVerticalGroup(
            painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEditarUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEditarUsuarioLayout.createSequentialGroup()
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEditarUsuarioLayout.createSequentialGroup()
                        .addComponent(iconNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(nomeLabel)
                .addGap(32, 32, 32)
                .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(emailLabel)
                .addGap(32, 32, 32)
                .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconIdade)
                    .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(idadeLabel)
                .addGap(32, 32, 32)
                .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconTelefone)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(telefoneLabel)
                .addGap(32, 32, 32)
                .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iconUsuario)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(nomeUsuarioLabel)
                .addGap(32, 32, 32)
                .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconSenha))
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(painelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(painelEditarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed

        new TelaInicial().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_bCancelarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        try {

            String novoNomeUsuario = textNome.getText();
            String novoEmailUsuario = textEmail.getText();
            int novoIdadeUsuario = Integer.parseInt(textIdade.getText());
            String novaTelefoneUsuario = textTelefone.getText();
            String novoUserUsuario = textUsuario.getText();
            String novaSenhaUsuario = new String(textSenha.getPassword());
            JogadorDAO dao = new JogadorDAO();
            FasesDAO dao2 = new FasesDAO();
            Jogador jogador = new Jogador(novoUserUsuario, novaSenhaUsuario);
            
            
            
            if (dao.verificar(jogador) == true) {
                JOptionPane.showMessageDialog(null, "Esse usuário já existe!");
            } else {
                Jogador jogador2 = new Jogador(novoNomeUsuario, novoEmailUsuario, novoIdadeUsuario, novaTelefoneUsuario, novoUserUsuario, novaSenhaUsuario, Jogador.nomeDoUsuario);
                Jogador jogador3 = new Jogador(novoUserUsuario);
                dao.atualizar(jogador2);
                dao2.alterar_jogador_pergunta(jogador3, jogador.nomeDoUsuario);
                this.dispose();
                new TelaInicial().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEditar;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconIdade;
    private javax.swing.JLabel iconNome;
    private javax.swing.JLabel iconSenha;
    private javax.swing.JLabel iconTelefone;
    private javax.swing.JLabel iconUsuario;
    private javax.swing.JLabel idadeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeUsuarioLabel;
    private javax.swing.JPanel painelEditarUsuario;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textTelefone;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
