
package pkgInterface.Dialogs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.ConexaoBD;

/**
 *
 * @author felip
 */
public class PesquisaClientes extends javax.swing.JPanel {

    public String retorno;
    public PesquisaClientes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbPesquisa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        edtTexto = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        rbCodigo = new javax.swing.JRadioButton();
        rbNome = new javax.swing.JRadioButton();
        btnConfirma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        edtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTextoActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        gbPesquisa.add(rbCodigo);
        rbCodigo.setSelected(true);
        rbCodigo.setText("Código");

        gbPesquisa.add(rbNome);
        rbNome.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(rbNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edtTexto)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCodigo)
                    .addComponent(rbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConfirma.setText("CONFIRMA");
        btnConfirma.setEnabled(false);
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        tabClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabClientes.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(70);
        tabClientes.getTableHeader().getColumnModel().getColumn(0).setMinWidth(70);
        jScrollPane1.setViewportView(tabClientes);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesquisa de Clientes");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void edtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTextoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        if(rbCodigo.isSelected() && !edtTexto.getText().isEmpty())
            buscaPorCodigo();
        else if(rbNome.isSelected() && !edtTexto.getText().isEmpty())
                buscaPorNome();
        else{
            JOptionPane.showMessageDialog(this, "A caixa de texto não deve ser vazia!","Info",JOptionPane.INFORMATION_MESSAGE);
            edtTexto.requestFocus();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmaActionPerformed

    //remove o resultado de consultas anteriores
    private void limpaTabela(DefaultTableModel model){
        
        while (model.getRowCount() > 0){
            model.removeRow(0);
        }
        tabClientes.updateUI();
    }
    
    //Pesquisa produtos por Descrição
    private void buscaPorNome(){
         String sql = "SELECT C.codigo,C.nome"
                  + " FROM CLIENTE C WHERE C.nome like '%"+edtTexto.getText()+"%' ORDER BY codigo"; 
       ConexaoBD conexao = new ConexaoBD();
       conexao.conectar();
       DefaultTableModel model = (DefaultTableModel) tabClientes.getModel();
       try {
            ResultSet res = conexao.consultaBD(sql);
            limpaTabela(model);
            while(res.next()){
                Integer codigo = res.getInt("codigo");
                String nome = res.getString("nome");
                Object [] cliente = {codigo,nome};
                model.addRow(cliente);
                tabClientes.updateUI();
            }
            if(tabClientes.getRowCount() > 0){
                btnConfirma.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Não há clientes cadastrados com o nome informado !","Info",JOptionPane.INFORMATION_MESSAGE);
                btnConfirma.setEnabled(false);
            }
            conexao.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(PesquisaProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Pesquisa por codigo
    private void buscaPorCodigo(){
        String sql = "SELECT C.codigo,C.nome"
                  + " FROM CLIENTE C WHERE CAST(C.codigo as varchar(10)) like '%"+edtTexto.getText()+"%' ORDER BY codigo"; 
       ConexaoBD conexao = new ConexaoBD();
       conexao.conectar();
       DefaultTableModel model = (DefaultTableModel) tabClientes.getModel();
       try {
            ResultSet res = conexao.consultaBD(sql);
            limpaTabela(model);
            while(res.next()){
                Integer codigo = res.getInt("codigo");
                String nome = res.getString("nome");
                Object [] cliente = {codigo,nome};
                model.addRow(cliente);
                tabClientes.updateUI();
            }
            if(tabClientes.getRowCount() > 0){
                btnConfirma.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Não há clientes cadastrados com o código informado !","Info",JOptionPane.INFORMATION_MESSAGE);
                btnConfirma.setEnabled(false);
            }
            conexao.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(PesquisaProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public JButton getBtnConfirma() {
        return btnConfirma;
    }

    public void setBtnConfirma(JButton btnConfirma) {
        this.btnConfirma = btnConfirma;
    }

    public JTable getTabClientes() {
        return tabClientes;
    }

    public void setTabClientes(JTable tabProdutos) {
        this.tabClientes = tabProdutos;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField edtTexto;
    private javax.swing.ButtonGroup gbPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tabClientes;
    // End of variables declaration//GEN-END:variables
}
