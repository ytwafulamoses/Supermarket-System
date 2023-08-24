
package supermarket;


import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Category extends javax.swing.JFrame {
   
   Connection conn = null;
   ResultSet rst = null;
   PreparedStatement pst = null;
   
   
    public Category() {
        
       initComponents();
       conn = javaconnect.ConnectDb();
       Update_table();
    }
              
    private void Update_table(){
    try {
    String sql = "select * from tblCategory "; 
    pst = conn.prepareStatement(sql);
    rst = pst.executeQuery();
    tblCategory10.setModel(DbUtils.resultSetToTableModel(rst));
    
            }   
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    }
    finally{
    try{
    rst.close();
    pst.close();}
    catch(Exception e){}
}
     }
	
    
    
	

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CatId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CatDesc = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        CatName = new javax.swing.JTextField();
        EditBtn2 = new javax.swing.JButton();
        ClearBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory10 = new javax.swing.JTable();
        logoutbtn = new javax.swing.JButton();
        existbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        menuebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("MANAGE CATEGORIES");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText(" CATID");

        CatId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatId.setForeground(new java.awt.Color(255, 51, 51));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("NAME");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("DESCRIPTION");

        CatDesc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatDesc.setForeground(new java.awt.Color(255, 51, 51));

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setMnemonic('D');
        DeleteBtn.setText("Delete");
        DeleteBtn.setBorder(null);
        DeleteBtn.setBorderPainted(false);
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(255, 51, 51));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setMnemonic('A');
        AddBtn.setText("Add");
        AddBtn.setBorder(null);
        AddBtn.setBorderPainted(false);
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("CATEGORIES LIST");

        CatName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatName.setForeground(new java.awt.Color(255, 51, 51));

        EditBtn2.setBackground(new java.awt.Color(255, 51, 51));
        EditBtn2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditBtn2.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn2.setMnemonic('E');
        EditBtn2.setText("Edit");
        EditBtn2.setBorder(null);
        EditBtn2.setBorderPainted(false);
        EditBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtn2ActionPerformed(evt);
            }
        });

        ClearBtn1.setBackground(new java.awt.Color(255, 51, 51));
        ClearBtn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ClearBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn1.setMnemonic('C');
        ClearBtn1.setText("Clear");
        ClearBtn1.setBorder(null);
        ClearBtn1.setBorderPainted(false);
        ClearBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtn1ActionPerformed(evt);
            }
        });

        tblCategory10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tblCategory10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "DESCRIPTION"
            }
        ));
        tblCategory10.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblCategory10.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblCategory10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategory10MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategory10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(68, 68, 68)
                                    .addComponent(CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(CatDesc)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(68, 68, 68)
                                .addComponent(CatId, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(173, 173, 173)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel12)))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel11)
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CatId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CatDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(EditBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(ClearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        logoutbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 51, 51));
        logoutbtn.setMnemonic('L');
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        existbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        existbtn.setForeground(new java.awt.Color(255, 51, 51));
        existbtn.setMnemonic('X');
        existbtn.setText("X");
        existbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existbtnActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/logo.png"))); // NOI18N

        menuebtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuebtn.setForeground(new java.awt.Color(255, 51, 51));
        menuebtn.setMnemonic('M');
        menuebtn.setText("Menue");
        menuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(existbtn))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(existbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
         if(CatId.getText().isEmpty()){
         JOptionPane.showMessageDialog(this,"Enter The Category  To be Deleted");  
       }
       else{
          try{
              String sql= "Delete from tblCategory where CatId=?";
              pst= conn.prepareStatement(sql);
              pst.setString(1,CatId.getText());
 
      
             pst.execute();
            JOptionPane.showMessageDialog(null,"Category Deleted Successfully");
    }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
}
         Update_table();  
       }
          }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
       if(CatId.getText().isEmpty()||CatName.getText().isEmpty()||CatDesc.getText().isEmpty()){
         JOptionPane.showMessageDialog(this,"Missing Information");  
       }
         else {
               try{
      String sql= "Insert into tblCategory (CatId,CatName,CatDesc) values(?,?,?)";
      pst= conn.prepareStatement(sql);
      pst.setString(1,CatId.getText());
      pst.setString(2,CatName.getText());
      pst.setString(3,CatDesc.getText());
      
      pst.execute();
      JOptionPane.showMessageDialog(null,"Category Added Successful");
    }
    catch(Exception e){
	JOptionPane.showMessageDialog(null,e);
       }
     Update_table();           
        Update_table();}    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtn2ActionPerformed
        if(CatId.getText().isEmpty()||CatName.getText().isEmpty()||CatDesc.getText().isEmpty()){
         JOptionPane.showMessageDialog(this,"Missing Information");  
       }
         else {
               try {
       String value1 = CatId.getText();
       String value2 = CatName.getText();
       String value3 = CatDesc.getText();
       
       String sql= "update tblCategory set CatId = '"+value1+"', CatName ='"+value2+"', CatDesc='"+value3+"' where CatId='"+value1+"' ";          
       pst= conn.prepareStatement(sql);
       pst.execute();
       JOptionPane.showMessageDialog(null,"Category Updated");
             }
      catch(Exception e){
	JOptionPane.showMessageDialog(null,e);
      }
        Update_table();}    }//GEN-LAST:event_EditBtn2ActionPerformed
    
   
    
      
    private void ClearBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtn1ActionPerformed
        CatId.setText(null);
        CatName.setText(null);
        CatDesc.setText(null);

    }//GEN-LAST:event_ClearBtn1ActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
          
          new Login().setVisible(true);
          this.dispose();
               
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void existbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existbtnActionPerformed

                     System.exit(0);

    }//GEN-LAST:event_existbtnActionPerformed

    private void menuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuebtnActionPerformed

        new Menue().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_menuebtnActionPerformed

    private void tblCategory10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategory10MouseClicked

    int selectedRow = tblCategory10.getSelectedRow();
    DefaultTableModel model = (DefaultTableModel) tblCategory10.getModel();
    CatId.setText(model.getValueAt(selectedRow, 0).toString());
    CatName.setText(model.getValueAt(selectedRow, 1).toString());
    CatDesc.setText(model.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_tblCategory10MouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CatDesc;
    private javax.swing.JTextField CatId;
    private javax.swing.JTextField CatName;
    private javax.swing.JButton ClearBtn1;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn2;
    private javax.swing.JButton existbtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton menuebtn;
    private javax.swing.JTable tblCategory10;
    // End of variables declaration//GEN-END:variables

   

  
}
