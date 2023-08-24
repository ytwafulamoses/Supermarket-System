
package supermarket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
// Import the LocalDateTime class
import java.time.LocalDateTime;


public class BILLTWO extends javax.swing.JFrame {

             Connection conn = null;
             ResultSet rst = null;
             PreparedStatement pst = null;
             java.util.Date bill_date= new java.util.Date();
   
    public BILLTWO() {
        initComponents();
        
        //jTable1.getColumnModel().getColumn(0).getPreferredWidth(30);
      //  jTable1.getColumnModel().getColumn(1).getPreferredWidth(200);
      
        
        
    }
    
    
      public String ConvertDate(java.util.Date date){

    SimpleDateFormat billdate = new SimpleDateFormat("yyyy-MM-dd");
    String s = billdate.format(date);
    return s;
  }
    
     
           private void showTOT2() {
    try {
        String sql = "SELECT bils.item, bils.Quantity, bils.Price  FROM bils "; 
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seler", "root", "");
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();
        TOT2.setModel(DbUtils.resultSetToTableModel(rst));
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An error occurred while executing the SQL query: " + e.getMessage());
    } finally {
        try {
            if (rst != null) {
                rst.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while closing the database resources: " + e.getMessage());
        }
    }
}
 


   
    public void addtable(int id, String Name, int Qty ,double Price ){
    
    DefaultTableModel  dt = (DefaultTableModel)jTable1.getModel();
    
    DecimalFormat df = new DecimalFormat("00.00");
    double totPrice = Price * Double.valueOf(Qty);
   
   String TotalPrice = df.format(totPrice);
    
    //product allready add chk
    
    for (int row = 0; row < jTable1.getRowCount(); row++ ){
      
          if(Name == jTable1.getValueAt(row, 1)){
          
             dt.removeRow(jTable1.convertRowIndexToModel(row));
          }
    
    }
    
    
    Vector v = new Vector();
    v.add(id);
    v.add(Name);
    v.add(Qty);
    v.add(totPrice);
    
     dt.addRow(v);
    
   }
  
    
    public double cal(){
    
      //cal total table values
      int numOfRow = jTable1.getRowCount();
      double tot = 0.0;
      
      for(int i = 0; i < numOfRow; i++ ){
          double value = Double.valueOf(jTable1.getValueAt(i,3).toString());
          tot += value;
      }
      
      DecimalFormat df = new DecimalFormat("00.00");
      totalLabel.setText(df.format(tot));
      
      // Return the formatted total value
      return Double.parseDouble(df.format(tot));
}

 
 
   






    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        TOT2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        q9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        q6 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        q11 = new javax.swing.JLabel();
        btn45 = new javax.swing.JButton();
        q45 = new javax.swing.JLabel();
        btn46 = new javax.swing.JButton();
        q46 = new javax.swing.JLabel();
        btn49 = new javax.swing.JButton();
        q51 = new javax.swing.JLabel();
        btn47 = new javax.swing.JButton();
        q47 = new javax.swing.JLabel();
        btn7 = new javax.swing.JButton();
        q50 = new javax.swing.JLabel();
        btn48 = new javax.swing.JButton();
        q48 = new javax.swing.JLabel();
        btn70 = new javax.swing.JButton();
        q70 = new javax.swing.JLabel();

        TOT2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Quantity", "Price"
            }
        ));
        TOT2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TOT2ComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(TOT2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Iteam", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        b.setColumns(20);
        b.setRows(5);
        jScrollPane2.setViewportView(b);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Total :");

        totalLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        totalLabel.setText("00");

        pay.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Cash :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Balance :");

        bal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bal.setText("00");

        jButton12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton12.setMnemonic('D');
        jButton12.setText("Delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton11.setMnemonic('A');
        jButton11.setText("Pay");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton7.setMnemonic('P');
        jButton7.setText("Print");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnreset.setMnemonic('R');
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        sales.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        sales.setMnemonic('B');
        sales.setText("Billone");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton7)
                        .addGap(45, 45, 45)
                        .addComponent(btnreset)))
                .addGap(40, 40, 40)
                .addComponent(jButton12)
                .addGap(44, 44, 44)
                .addComponent(sales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pay))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalLabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bal))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 1030, 1030));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/2chapatibeans1.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/chapatibeaf 1.jpg"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        q7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");

        q8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/blacktea.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/African Tea.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");

        q2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Juice (2).jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Rolex 2.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        q4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");

        q5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Goat Pilauo1.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Katogo2.jpg"))); // NOI18N
        jButton10.setToolTipText("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        q9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Katogo chapati2.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        q6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/beef Rice Chapati1.jpg"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        q11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q11.setText("0");

        btn45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Chicken-Pulao 1.jpg"))); // NOI18N
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });

        q45.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q45.setText("0");

        btn46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Pilauo Chips2.jpg"))); // NOI18N
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });

        q46.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q46.setText("0");

        btn49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Chips2.jpg"))); // NOI18N
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn49ActionPerformed(evt);
            }
        });

        q51.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q51.setText("0");

        btn47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Chips 1 chicken 2.jpg"))); // NOI18N
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });

        q47.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q47.setText("0");

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/2pc chicken chips 4.jpg"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        q50.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q50.setText("0");

        btn48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Chips 3 piece chicken 1.jpg"))); // NOI18N
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });

        q48.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q48.setText("0");

        btn70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/Fruits1.jpg"))); // NOI18N
        btn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70ActionPerformed(evt);
            }
        });

        q70.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        q70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q70.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q51, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q47, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q50, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q48, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q11, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q45, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q46, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q70, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(q45, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(q46, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(q11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q51, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q47, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(q50, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(q48, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(q70, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TOT2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TOT2ComponentShown
        
        
          
    }//GEN-LAST:event_TOT2ComponentShown

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        // btn code
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));

        addtable(9,"2Chapati Beef            ",i,5000);
        cal();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed

        new sale().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed

        // Clear the table model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        DefaultTableModel f = (DefaultTableModel) TOT2.getModel();
        f.setRowCount(0);

        b.setText("");
        pay.setText("");
        bal.setText("00");
        totalLabel.setText("00");
        q1.setText("0");
        q2.setText("0");
        q3.setText("0");
        q4.setText("0");
        q5.setText("0");
        q6.setText("0");
        q7.setText("0");
        q8.setText("0");
        q9.setText("0");
        q11.setText("0");
        q45.setText("0");
        q46.setText("0");
        q47.setText("0");
        q48.setText("0");
        q51.setText("0");
        q50.setText("0");
        q70.setText("0");
    }//GEN-LAST:event_btnresetActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Connection conn = null;
        try {
            // Set up the connection to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/seler", "root", "");

            // Set up the bill header
            b.setText("                                   City Walk Cafe \n");
            b.setText(b.getText() + "                                   Kalmax Building\n");
            b.setText(b.getText() + "                                   Ground floor plot 56, Bombo Road\n");
            b.setText(b.getText() + "                                   +256 700244502\n");
            b.setText(b.getText() + "                                   +256 760493151\n");
            b.setText(b.getText() + "------------------------------------------------------------------------------------\n");
            // Add the date and time to the bill header
            b.setText(b.getText() + "Date: " + bill_date.toString() + "\n");
            b.setText(b.getText() + "Item \t\tQty \tPrice\n");

            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();

            double total = 0;

            // Get table product details
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String Name = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Price = df.getValueAt(i, 3).toString();

                b.setText(b.getText() + "  " + Name + "\t" + Qty + "\t" + Price + "\n");

                // Extract the quantity and price values
                int qty = Integer.parseInt(Qty);
                double price = Double.parseDouble(Price);

                // Add the product total to the overall total
                total += qty * price;

                // Insert the data into the bils table
                String sql = "INSERT INTO bils (item, Quantity, price) VALUES (?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, Name);
                statement.setInt(2, qty);
                statement.setDouble(3, price);
               // statement.setDouble(4, total);
                statement.executeUpdate();
            }

            // Insert the total into the tots table
            String sql = "INSERT INTO tots ( TOTAL_SALE , SALE_DATE , SALE_TIME) VALUES ( ?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, total);
            statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
                   statement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            statement.executeUpdate();

            // Add the total to the bill footer
            b.setText(b.getText() + "------------------------------------------------------------------------------------\n");
            b.setText(b.getText() + "Total: \t\t\t" + total + "\n");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            // Close the database connection
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        showTOT2();
        //showTOT3();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        //pat btn

        double tot = Double.valueOf(totalLabel.getText());
        double paid = Double.valueOf(pay.getText());
        double balance = paid - tot ;

        DecimalFormat df = new DecimalFormat("00.00");

        bal.setText(String.valueOf(df.format(balance)));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        //Delete some iteam

        DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();

        String r = dt.getValueAt(jTable1.getSelectedRow(), 0).toString();

        //remove product
        int rw = jTable1.getSelectedRow();
        dt.removeRow(rw);

        //remove Qty Label
        System.out.println(r);
        switch(r){

            case "1" :
            q1.setText("0");
            break;

            case "2" :
            q2.setText("0");
            break;

            case "3" :
            q3.setText("0");
            break;

            case "4" :
            q4.setText("0");
            break;

            case "5" :
            q5.setText("0");
            break;

            case "6" :
            q6.setText("0");
            break;

            case "7" :
            q7.setText("0");
            break;

            case "  8" :
            q8.setText("0");
            break;

            case "9" :
            q9.setText("0");
            break;

            default:

            System.out.println("Over");

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // btn code
        int i = Integer.valueOf(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));

        addtable(9,"Katogo Beef            ",i,6000);
        cal();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // btn code
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));

        addtable(8,"2Chapati Beans           ",i,5000);
        cal();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // btn code
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));

        addtable(6,"Katogo Chapati Beef               ",i,7000);
        cal();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // btn code
        int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));

        addtable(3,"Goat Meat Pilauo  ",i,12000);
        cal();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // btn code
        int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));

        addtable(5,"Rolex                      ",i,5000);
        cal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // btn code
        int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));

        addtable(2,"African Tea                 ",i,4000);
        cal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // btn code
        int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));

        addtable(4,"Juice                        ",i,4000);
        cal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // btn code
        int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));

        addtable(1,"Black Tea                      ",i,2000);

        cal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       
        
           // btn code
        int i = Integer.valueOf(q11.getText());
        ++i;
        q11.setText(String.valueOf(i));

        addtable(1,"Rice,Chapati Beef                    ",i,7000);

        cal();
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        
           // btn code
        int i = Integer.valueOf(q45.getText());
        ++i;
        q45.setText(String.valueOf(i));

        addtable(1,"Pilauo Chicken                    ",i,12000);

        cal();
        
        
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed

              // btn code
        int i = Integer.valueOf(q46.getText());
        ++i;
        q46.setText(String.valueOf(i));

        addtable(1,"1/2 Pilauo 1/2 Chicken           ",i,12000);

        cal();
        

    }//GEN-LAST:event_btn46ActionPerformed

    private void btn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn49ActionPerformed
        
              // btn code
        int i = Integer.valueOf(q51.getText());
        ++i;
        q51.setText(String.valueOf(i));

        addtable(1,"Chips Plain                       ",i,5000);

        cal();
        
        
    }//GEN-LAST:event_btn49ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        
                 // btn code
        int i = Integer.valueOf(q47.getText());
        ++i;
        q47.setText(String.valueOf(i));

        addtable(1,"Chips 1Pc Chicken           ",i,12000);

        cal();
        
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        
                   // btn code
        int i = Integer.valueOf(q50.getText());
        ++i;
        q50.setText(String.valueOf(i));

        addtable(1,"Chips 2Pc Chicken           ",i,19000);

        cal();
        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        
                 // btn code
        int i = Integer.valueOf(q48.getText());
        ++i;
        q48.setText(String.valueOf(i));

        addtable(1,"Chips 3Pc Chicken           ",i,26000);

        cal();
        
        
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70ActionPerformed
       
                   // btn code
        int i = Integer.valueOf(q70.getText());
        ++i;
        q70.setText(String.valueOf(i));

        addtable(1,"Fruits                       ",i,3000);

        cal();
        
        
        
    }//GEN-LAST:event_btn70ActionPerformed

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
            java.util.logging.Logger.getLogger(BILLTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BILLTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BILLTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BILLTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BILLTWO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TOT2;
    private javax.swing.JTextArea b;
    private javax.swing.JLabel bal;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn70;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q45;
    private javax.swing.JLabel q46;
    private javax.swing.JLabel q47;
    private javax.swing.JLabel q48;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q50;
    private javax.swing.JLabel q51;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q70;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JButton sales;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
