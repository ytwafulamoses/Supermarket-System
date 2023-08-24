
package supermarket;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Recordsales extends javax.swing.JFrame {

  
   Connection conn = null;
   ResultSet rst = null;
   PreparedStatement pst = null;
   
   
    public Recordsales() {
        initComponents();
        
          conn = javaconnect.ConnectDb();
        Update_table(); 
        showTOT2();
        tblrgd();
         tots();
        
        
    }

   
     private void Update_table(){
    try {
    String sql = "select * from bills "; 
    pst = conn.prepareStatement(sql);
    rst = pst.executeQuery();
    records2.setModel(DbUtils.resultSetToTableModel(rst));
    
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
     
     
     
   
     private void tblrgd(){
    try {
    String sql = "select * from tblgrd "; 
    pst = conn.prepareStatement(sql);
    rst = pst.executeQuery();
    records1.setModel(DbUtils.resultSetToTableModel(rst));
    
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
     
     private void tots(){
    try {
    String sql = "select * from tots "; 
    pst = conn.prepareStatement(sql);
    rst = pst.executeQuery();
    TOT3.setModel(DbUtils.resultSetToTableModel(rst));
    
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
     
     
           private void showTOT2() {
    try {
        String sql = "SELECT bils.item, bils.Quantity, bils.Price  , tots.SALE_DATE,tots.SALE_TIME,bils.ID FROM bils, tots"; 
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seler", "root", "");
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();
        TOT2.setModel(DbUtils.resultSetToTableModel(rst));
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An error occurred while executing the SQL query: " + e.getMessage());
    }/* finally {
        try {
            if (rst != null) {
                rst.close();
            }
            if (pst != null) {
                //pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while closing the database resources: " + e.getMessage());
        }
    }*/
     
}
     
     
     
     
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TOT2 = new javax.swing.JTable();
        DeleteBtn2 = new javax.swing.JButton();
        DeleteBtn4 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        TOT3 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        records2 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        records1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DeleteBtn9 = new javax.swing.JButton();
        DeleteBtn10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        existbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        menuebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("COMBO RECORDS");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("SALE  RECORDS");

        TOT2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Quantity", "Price", "sale_date"
            }
        ));
        TOT2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TOT2ComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(TOT2);

        DeleteBtn2.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteBtn2.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn2.setText("Delete4");
        DeleteBtn2.setBorder(null);
        DeleteBtn2.setBorderPainted(false);
        DeleteBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn2ActionPerformed(evt);
            }
        });

        DeleteBtn4.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteBtn4.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn4.setText("Delete2");
        DeleteBtn4.setBorder(null);
        DeleteBtn4.setBorderPainted(false);
        DeleteBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn4ActionPerformed(evt);
            }
        });

        TOT3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TOT3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TOTAL SALES", "DATE"
            }
        ));
        TOT3.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TOT3.setSelectionBackground(new java.awt.Color(255, 51, 51));
        TOT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TOT3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TOT3MousePressed(evt);
            }
        });
        TOT3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TOT3ComponentShown(evt);
            }
        });
        jScrollPane8.setViewportView(TOT3);

        records2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        records2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODNAME", "PRICE", "QUantity", "sale_date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        records2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        records2.setSelectionBackground(new java.awt.Color(255, 51, 51));
        records2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                records2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                records2MousePressed(evt);
            }
        });
        records2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                records2ComponentShown(evt);
            }
        });
        jScrollPane9.setViewportView(records2);

        records1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        records1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TOTAL SALES", "DATE"
            }
        ));
        records1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        records1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        records1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                records1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                records1MousePressed(evt);
            }
        });
        records1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                records1ComponentShown(evt);
            }
        });
        jScrollPane10.setViewportView(records1);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("TOTAL SALE");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("COMBO TOTAL");

        DeleteBtn9.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteBtn9.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn9.setText("Delete1");
        DeleteBtn9.setBorder(null);
        DeleteBtn9.setBorderPainted(false);
        DeleteBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn9ActionPerformed(evt);
            }
        });

        DeleteBtn10.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteBtn10.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn10.setText("Delete3");
        DeleteBtn10.setBorder(null);
        DeleteBtn10.setBorderPainted(false);
        DeleteBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(343, 343, 343))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DeleteBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DeleteBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(DeleteBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane9)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(DeleteBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(DeleteBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(DeleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(259, 259, 259))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262))))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("All You Need Under One Roof!");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/logo.png"))); // NOI18N

        existbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        existbtn.setForeground(new java.awt.Color(255, 51, 51));
        existbtn.setMnemonic('X');
        existbtn.setText("X");
        existbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existbtnActionPerformed(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 51, 51));
        logoutbtn.setMnemonic('L');
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        menuebtn.setBackground(new java.awt.Color(255, 255, 255));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(existbtn))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(existbtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(menuebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(logoutbtn)))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void TOT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TOT3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TOT3MouseClicked

    private void TOT3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TOT3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOT3MousePressed

    private void TOT3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TOT3ComponentShown

        try{
            Statement st = conn.createStatement();
            rst = st.executeQuery("select * from bills");
            TOT3.setModel(DbUtils.resultSetToTableModel(rst));

        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_TOT3ComponentShown

    private void menuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuebtnActionPerformed

        new Menue().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_menuebtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void existbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existbtnActionPerformed
        
          System.exit(0);
    }//GEN-LAST:event_existbtnActionPerformed

    private void TOT2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TOT2ComponentShown

    }//GEN-LAST:event_TOT2ComponentShown

    private void DeleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn2ActionPerformed
        
   
    // Get the selected row index
    int selectedRowIndex = TOT2.getSelectedRow();

    // Get the table model
    DefaultTableModel model = (DefaultTableModel) TOT2.getModel();

    // Get the data of the selected row
    String ID = model.getValueAt(selectedRowIndex, 5).toString(); // Assuming the first column is the bill ID

    // Delete the row from the MySQL database table
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seler", "root", "");
        String sql = "DELETE FROM bils WHERE ID = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, ID);
        int affectedRows = pst.executeUpdate();
        if (affectedRows == 0) {
            throw new SQLException("Deleting bill failed, no rows affected.");
        }
        JOptionPane.showMessageDialog(this, "Row deleted successfully");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting row: " + ex.getMessage());
    }

    // Remove the selected row from the JTable
    model.removeRow(selectedRowIndex);
        
        

    }//GEN-LAST:event_DeleteBtn2ActionPerformed

    private void DeleteBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn4ActionPerformed
        
   
    // Get the selected row index
    int selectedRowIndex = records2.getSelectedRow();

    // Get the table model
    DefaultTableModel model = (DefaultTableModel) records2.getModel();

    // Get the data of the selected row
    String ID = model.getValueAt(selectedRowIndex, 5).toString(); // Assuming the first column is the bill ID

    // Delete the row from the MySQL database table
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seler", "root", "");
        String sql = "DELETE FROM bills WHERE ID = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, ID);
        int affectedRows = pst.executeUpdate();
        if (affectedRows == 0) {
            throw new SQLException("Deleting bill failed, no rows affected.");
        }
        JOptionPane.showMessageDialog(this, "Row deleted successfully");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting row: " + ex.getMessage());
    }

    // Remove the selected row from the JTable
    model.removeRow(selectedRowIndex);
        
        
    }//GEN-LAST:event_DeleteBtn4ActionPerformed

    private void records2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_records2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_records2MouseClicked

    private void records2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_records2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_records2MousePressed

    private void records2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_records2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_records2ComponentShown

    private void records1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_records1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_records1MouseClicked

    private void records1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_records1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_records1MousePressed

    private void records1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_records1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_records1ComponentShown

    private void DeleteBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn9ActionPerformed
        
           
    // Get the selected row index
    int selectedRowIndex = records1.getSelectedRow();

    // Get the table model
    DefaultTableModel model = (DefaultTableModel) records1.getModel();

    // Get the data of the selected row
    String ID = model.getValueAt(selectedRowIndex, 3).toString(); // Assuming the first column is the bill ID

    // Delete the row from the MySQL database table
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seler", "root", "");
        String sql = "DELETE FROM tblgrd WHERE ID = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, ID);
        int affectedRows = pst.executeUpdate();
        if (affectedRows == 0) {
            throw new SQLException("Deleting bill failed, no rows affected.");
        }
        JOptionPane.showMessageDialog(this, "Row deleted successfully");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting row: " + ex.getMessage());
    }

    // Remove the selected row from the JTable
    model.removeRow(selectedRowIndex);
        
        
    }//GEN-LAST:event_DeleteBtn9ActionPerformed

    private void DeleteBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn10ActionPerformed
       
        
                     
    // Get the selected row index
    int selectedRowIndex = TOT3.getSelectedRow();

    // Get the table model
    DefaultTableModel model = (DefaultTableModel) TOT3.getModel();

    // Get the data of the selected row
    String ID = model.getValueAt(selectedRowIndex, 3).toString(); // Assuming the first column is the bill ID

    // Delete the row from the MySQL database table
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seler", "root", "");
        String sql = "DELETE FROM tots WHERE ID = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, ID);
        int affectedRows = pst.executeUpdate();
        if (affectedRows == 0) {
            throw new SQLException("Deleting bill failed, no rows affected.");
        }
        JOptionPane.showMessageDialog(this, "Row deleted successfully");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error deleting row: " + ex.getMessage());
    }

    // Remove the selected row from the JTable
    model.removeRow(selectedRowIndex);
        
        
    }//GEN-LAST:event_DeleteBtn10ActionPerformed

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
            java.util.logging.Logger.getLogger(Recordsales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recordsales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recordsales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recordsales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recordsales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn10;
    private javax.swing.JButton DeleteBtn2;
    private javax.swing.JButton DeleteBtn4;
    private javax.swing.JButton DeleteBtn9;
    private javax.swing.JTable TOT2;
    private javax.swing.JTable TOT3;
    private javax.swing.JButton existbtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton menuebtn;
    private javax.swing.JTable records1;
    private javax.swing.JTable records2;
    // End of variables declaration//GEN-END:variables
}
