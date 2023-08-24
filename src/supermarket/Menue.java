
package supermarket;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Menue extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;  
    public Menue() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cashierbtn = new javax.swing.JButton();
        billsbtn = new javax.swing.JButton();
        Cat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        pdtbtn = new javax.swing.JButton();
        existbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        records = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Billing Supermarket System");
        jLabel2.setToolTipText("");

        cashierbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cashierbtn.setForeground(new java.awt.Color(255, 51, 51));
        cashierbtn.setMnemonic('S');
        cashierbtn.setText("Manage Cashier");
        cashierbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashierbtnMouseClicked(evt);
            }
        });
        cashierbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierbtnActionPerformed(evt);
            }
        });

        billsbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        billsbtn.setForeground(new java.awt.Color(255, 51, 51));
        billsbtn.setMnemonic('B');
        billsbtn.setText("Bills");
        billsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsbtnActionPerformed(evt);
            }
        });

        Cat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Cat.setForeground(new java.awt.Color(255, 51, 51));
        Cat.setMnemonic('C');
        Cat.setText("Manage  Categoris");
        Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("to");

        logoutLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        logoutLabel.setText("logout");
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        admin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 51, 51));
        admin.setMnemonic('A');
        admin.setText("Admin");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        pdtbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pdtbtn.setForeground(new java.awt.Color(255, 51, 51));
        pdtbtn.setMnemonic('P');
        pdtbtn.setText("Manage Products");
        pdtbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdtbtnMouseClicked(evt);
            }
        });
        pdtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdtbtnActionPerformed(evt);
            }
        });

        existbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        existbtn.setForeground(new java.awt.Color(255, 51, 51));
        existbtn.setMnemonic('X');
        existbtn.setText("X");
        existbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                existbtnMouseClicked(evt);
            }
        });
        existbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existbtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/logout.png"))); // NOI18N

        records.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        records.setForeground(new java.awt.Color(255, 51, 51));
        records.setMnemonic('R');
        records.setText("Sales Records");
        records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(existbtn))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cashierbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cat)
                            .addComponent(billsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pdtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(records, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(existbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashierbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(records, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutLabel))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pdtbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdtbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pdtbtnMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminMouseClicked

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatActionPerformed
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CatActionPerformed

    private void billsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsbtnActionPerformed
         
        new sale().setVisible(true);
        this.dispose();
        
        
      /*  String cusid= JOptionPane.showInputDialog("Enter Customer's ID for the bill:");
        int cusidi= Integer.parseInt(cusid);
        new bills(cusidi,"none").setVisible(true);

        this.dispose();*/
    }//GEN-LAST:event_billsbtnActionPerformed

    private void cashierbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierbtnActionPerformed
        new Cashier().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cashierbtnActionPerformed

    private void cashierbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cashierbtnMouseClicked

    private void existbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_existbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_existbtnMouseClicked

    private void existbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_existbtnActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void pdtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdtbtnActionPerformed
          new Products().setVisible(true);
          this.dispose();    }//GEN-LAST:event_pdtbtnActionPerformed

    private void recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordsActionPerformed
           new Recordsales().setVisible(true);
           this.dispose();
    }//GEN-LAST:event_recordsActionPerformed

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
            java.util.logging.Logger.getLogger(Menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cat;
    private javax.swing.JButton admin;
    private javax.swing.JButton billsbtn;
    private javax.swing.JButton cashierbtn;
    private javax.swing.JButton existbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JButton pdtbtn;
    private javax.swing.JButton records;
    // End of variables declaration//GEN-END:variables
}
