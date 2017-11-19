/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho.av2;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CadastroUsuario extends javax.swing.JFrame {

    public String opcao = "";

    public CadastroUsuario() {
        initComponents();
        setResizable(false);
        setTitle("Cadastro de Usuário");
        txtid.setVisible(false);
        DAOUsuario dao = new DAOUsuario();
        List<Endereco> listaLograduro;
        listaLograduro = dao.listarLogradouro();
        for (Endereco logradouro : listaLograduro) {
            cbLogradouro.addItem(logradouro.getLogradouro());
        }
        List<Endereco> listaComplemento;
        listaComplemento = dao.listarComplemento();
        for (Endereco complemento : listaComplemento) {
            cbComplemento.addItem(complemento.getComplemento());
        }
        List<Endereco> listaBairro;
        listaBairro = dao.listarBairro();
        for (Endereco bairro : listaBairro) {
            cbBairro.addItem(bairro.getBairro());
        }
        List<Endereco> listaNumero;
        listaNumero = dao.listarNumero();
        for (Endereco numero : listaNumero) {
            cbNumero.addItem(numero.getNumero());
        }
        List<Endereco> listaCep;
        listaCep = dao.listarCep();
        for (Endereco cep : listaCep) {
            cbCep.addItem(cep.getCep());
        }
        List<Perfil> listaPerfil;
        listaPerfil = dao.listarNomePerfil();
        for (Perfil perfil : listaPerfil) {
            cbPerfil.addItem(perfil.getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblSobreNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pnlEndereco = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbLogradouro = new javax.swing.JComboBox<>();
        cbBairro = new javax.swing.JComboBox<>();
        cbComplemento = new javax.swing.JComboBox<>();
        cbNumero = new javax.swing.JComboBox<>();
        cbCep = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbPerfil = new javax.swing.JComboBox<>();
        btnGravar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("fUsuario"); // NOI18N

        lblNome.setText("Nome");

        lblSobreNome.setText("Sobrenome");

        txtNome.setEnabled(false);

        txtSobrenome.setEnabled(false);

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Logradouro");

        jLabel2.setText("Complemento");

        jLabel3.setText("Bairro");

        jLabel4.setText("Número");

        jLabel5.setText("CEP");

        cbLogradouro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbLogradouro.setEnabled(false);

        cbBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbBairro.setEnabled(false);

        cbComplemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbComplemento.setEnabled(false);

        cbNumero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbNumero.setEnabled(false);

        cbCep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbCep.setEnabled(false);

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbLogradouro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8)
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                                .addComponent(cbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCep, 0, 159, Short.MAX_VALUE))
                            .addComponent(cbComplemento, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbBairro, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel6.setText("Perfil");

        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbPerfil.setEnabled(false);
        cbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPerfilActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome)
                            .addComponent(lblSobreNome)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir)
                        .addGap(32, 32, 32)
                        .addComponent(btnAlterar)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscar)
                        .addGap(26, 26, 26)
                        .addComponent(btnGravar)
                        .addGap(33, 33, 33)
                        .addComponent(btnExcluir))
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobreNome)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnBuscar)
                    .addComponent(btnExcluir)
                    .addComponent(btnGravar))
                .addGap(19, 19, 19))
        );

        pnlEndereco.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPerfilActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

        btnGravar.setEnabled(true);
        cbBairro.setEnabled(true);
        cbComplemento.setEnabled(true);
        txtNome.setEnabled(true);
        cbLogradouro.setEnabled(true);
        cbCep.setEnabled(true);
        txtSobrenome.setEnabled(true);
        cbNumero.setEnabled(true);
        txtNome.grabFocus();
        cbPerfil.setEnabled(true);
        opcao = "Inserir";


    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        DAOUsuario dao = new DAOUsuario();
        List<Usuario> lista;
        lista = dao.listarUsuario();
        for (Usuario usuario : lista) {
            txtSobrenome.setText(usuario.getSobrenome());
            txtNome.setText(usuario.getNome());
            txtid.setText(String.valueOf(usuario.getId_usuario()));

        }

        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        cbBairro.setEnabled(false);
        cbComplemento.setEnabled(false);
        txtNome.setEnabled(false);
        cbLogradouro.setEnabled(false);
        cbCep.setEnabled(false);
        txtSobrenome.setEnabled(false);
        cbNumero.setEnabled(false);


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        
            Usuario usuario = new Usuario();
            DAOUsuario dao = new DAOUsuario();
            Perfil perfil = new Perfil();
            Endereco endereco = new Endereco();
            usuario.setNome(txtNome.getText());
            usuario.setSobrenome(txtSobrenome.getText());
            usuario.setEndereco(endereco);
            usuario.setPerfil(perfil);

            switch (opcao) {
                case "Inserir":
                    dao.salvarUsuario(usuario);
                    opcao = "";
                    break;
                case "Alterar":
                    usuario.setId_usuario(Integer.parseInt(txtid.getText()));
                    dao.alterarUsuario(usuario);
                    opcao = "";
                    break;
                case "Excluir":
                    usuario.setId_usuario(Integer.parseInt(txtid.getText()));
                    int resposta = JOptionPane.showConfirmDialog(null, "Confima Exclusão?",
                            "Excluir Usuário", JOptionPane.YES_NO_OPTION);
                    if (resposta == 0) {
                        dao.deletarUsuario(usuario);
                        opcao = "";
                    }
                    
                    break;
            }
            txtNome.setText("");
            txtSobrenome.setText("");
            cbBairro.addItem("");
            cbCep.addItem("");
            cbComplemento.addItem("");
            cbLogradouro.addItem("");
            cbNumero.addItem("");
            cbPerfil.addItem("");
            txtNome.setEnabled(false);
            txtSobrenome.setEnabled(false);
            cbBairro.setEnabled(false);
            cbCep.setEnabled(false);
            cbComplemento.setEnabled(false);
            cbLogradouro.setEnabled(false);
            cbNumero.setEnabled(false);
            cbPerfil.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnGravar.setEnabled(false);
        

    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnGravar.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        cbLogradouro.setEnabled(true);
        cbCep.setEnabled(true);
        cbComplemento.setEnabled(true);
        cbNumero.setEnabled(true);
        cbPerfil.setEnabled(true);
        cbBairro.setEnabled(true);
        btnExcluir.setEnabled(false);
        opcao = "Alterar";
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        btnGravar.setEnabled(true);
        txtNome.setText("");
        txtSobrenome.setText("");
        cbBairro.addItem("");
        cbCep.addItem("");
        cbComplemento.addItem("");
        cbLogradouro.addItem("");
        cbNumero.addItem("");
        cbPerfil.addItem("");
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        cbBairro.setEnabled(false);
        cbCep.setEnabled(false);
        cbComplemento.setEnabled(false);
        cbLogradouro.setEnabled(false);
        cbNumero.setEnabled(false);
        cbPerfil.setEnabled(false);
        opcao = "Excluir";
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cbBairro;
    private javax.swing.JComboBox<String> cbCep;
    private javax.swing.JComboBox<String> cbComplemento;
    private javax.swing.JComboBox<String> cbLogradouro;
    private javax.swing.JComboBox<String> cbNumero;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobreNome;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
