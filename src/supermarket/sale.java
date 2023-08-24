
package supermarket;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.gt;




public class sale extends javax.swing.JFrame {

   
   Connection conn = null;
   ResultSet rst = null;
   PreparedStatement pst = null;
   java.util.Date bill_date = new java.util.Date();
   
   
    public sale() {
         initComponents();
        conn = javaconnect.ConnectDb();
        Update_table(); 
        GetCat();
        
    }
    
     public String ConvertDate(java.util.Date date){

    SimpleDateFormat billdate = new SimpleDateFormat("yyyy-MM-dd");
    String s = billdate.format(date);
    return s;
  }

    
     
     
     private void Update_table(){
    try {
    String sql = "select * from tblProduct "; 
    pst = conn.prepareStatement(sql);
    rst = pst.executeQuery();
    tblProduct1.setModel(DbUtils.resultSetToTableModel(rst));
    
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
     
     
    
     
     
 
     

     
     int newQty;
     public void update(){
         
         if(ProdQty.getText().isEmpty() || ProdName.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Missing Information");  
    } else {
        try {
            int newQty = Integer.parseInt(ProdQty.getText()); // assuming ProdQty is a text field that contains the new quantity
            
            String sql = "UPDATE tblProduct SET ProdQty = ProdQty - ? WHERE ProdName = ? AND ProdQty >= ?";           
            pst = conn.prepareStatement(sql);
            pst.setInt(1, newQty);
            pst.setString(2, ProdName.getText());
            pst.setInt(3, newQty);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Product Updated");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        Update_table(); 
    }  
         
            
     }
     
      private void GetCat()
     {
          try {
     String query = "select * from tblCategory ";
     pst = conn.prepareStatement(query);
     rst = pst.executeQuery();
    while(rst.next())
    {
         String Mycat = rst.getString("CatName");
         CatCb.addItem(Mycat);
         
    }
    
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
         
      int prodid;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ProdPrice = new javax.swing.JTextField();
        CatCb = new javax.swing.JComboBox();
        AddBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        GrdTotallb1 = new javax.swing.JLabel();
        Filterbtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        barcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        existbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("NAME");

        ProdName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdName.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("QUANTITY");

        ProdQty.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(255, 51, 51));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("UNIT PRICE");

        ProdPrice.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ProdPrice.setForeground(new java.awt.Color(255, 51, 51));

        CatCb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatCb.setForeground(new java.awt.Color(255, 51, 51));
        CatCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatCbMouseClicked(evt);
            }
        });
        CatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(255, 51, 51));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setMnemonic('A');
        AddBtn.setText("Add To Bill");
        AddBtn.setBorder(null);
        AddBtn.setBorderPainted(false);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(255, 51, 51));
        PrintBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrintBtn.setMnemonic('P');
        PrintBtn.setText("Print");
        PrintBtn.setBorder(null);
        PrintBtn.setBorderPainted(false);
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        Deletebtn.setBackground(new java.awt.Color(255, 51, 51));
        Deletebtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        Deletebtn.setMnemonic('R');
        Deletebtn.setText("Refresh");
        Deletebtn.setBorder(null);
        Deletebtn.setBorderPainted(false);
        Deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletebtnMouseClicked(evt);
            }
        });
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        tblProduct1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tblProduct1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUM", "PRODUCT", "QUANTITY", "PRICE", "TOTAL"
            }
        ));
        tblProduct1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblProduct1.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblProduct1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProduct1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProduct1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct1);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("PRODUCTS LIST");

        BillTxt.setColumns(20);
        BillTxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        GrdTotallb1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        GrdTotallb1.setForeground(new java.awt.Color(255, 51, 51));
        GrdTotallb1.setText("TOTAL");
        GrdTotallb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrdTotallb1MouseClicked(evt);
            }
        });

        Filterbtn.setBackground(new java.awt.Color(255, 51, 51));
        Filterbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Filterbtn.setForeground(new java.awt.Color(255, 255, 255));
        Filterbtn.setText("Filter");
        Filterbtn.setBorder(null);
        Filterbtn.setBorderPainted(false);
        Filterbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterbtnMouseClicked(evt);
            }
        });
        Filterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterbtnActionPerformed(evt);
            }
        });

        bill.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdName", "Price", "ProdQty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bill.setIntercellSpacing(new java.awt.Dimension(0, 0));
        bill.setSelectionBackground(new java.awt.Color(255, 51, 51));
        bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billMousePressed(evt);
            }
        });
        bill.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                billComponentShown(evt);
            }
        });
        jScrollPane4.setViewportView(bill);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("CATEGORY");

        barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barcodeKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("BARCODE");

        ClearBtn.setBackground(new java.awt.Color(255, 51, 51));
        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setMnemonic('C');
        ClearBtn.setText("Clear");
        ClearBtn.setBorder(null);
        ClearBtn.setBorderPainted(false);
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(240, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setMnemonic('B');
        jButton1.setText("BILLTWO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(615, 615, 615)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(barcode)
                                    .addComponent(ProdPrice)
                                    .addComponent(ProdQty)
                                    .addComponent(ProdName)
                                    .addComponent(CatCb, 0, 225, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(GrdTotallb1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(287, 287, 287))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Filterbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(Filterbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(ProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GrdTotallb1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BILLING POINT");
        jLabel11.setToolTipText("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/bill.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(existbtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel11))
                            .addComponent(jLabel1)))
                    .addComponent(existbtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(408, 408, 408))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1553, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new BILLTWO().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void billComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_billComponentShown

        try{
            Statement st = conn.createStatement();
            rst = st.executeQuery("select * from bills");
            bill.setModel(DbUtils.resultSetToTableModel(rst));

        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_billComponentShown

    private void billMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_billMousePressed

    private void billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_billMouseClicked

    private void FilterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterbtnActionPerformed

    private void FilterbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterbtnMouseClicked

        try {
            String sql = "SELECT * FROM tblCategory WHERE CatName = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, CatCb.getSelectedItem().toString());
            rst = pst.executeQuery();
            tblProduct1.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Close the PreparedStatement and ResultSet objects

            try{
                rst.close();
                pst.close();}
            catch(Exception e){}

        }
    }//GEN-LAST:event_FilterbtnMouseClicked

    private void GrdTotallb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrdTotallb1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GrdTotallb1MouseClicked

    private void tblProduct1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProduct1MousePressed
    
     int selectedRow = tblProduct1.getSelectedRow();
    DefaultTableModel model = (DefaultTableModel) tblProduct1.getModel();
    Uprice = Double.valueOf(model.getValueAt(selectedRow, 3).toString());
    AvailQty = Integer.valueOf(model.getValueAt(selectedRow, 2).toString());
    ProdName.setText(model.getValueAt(selectedRow, 1).toString());
   // ProdPrice.setText(rst.getString());
   // Uprice = Double.valueOf(model.getValueAt(selectedRow, 4).toString());
    ProdTot = Uprice * Integer.valueOf(ProdQty.getText());
       
    }//GEN-LAST:event_tblProduct1MousePressed

    private void tblProduct1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProduct1MouseClicked
      
    }//GEN-LAST:event_tblProduct1MouseClicked

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed

        
        ProdName.setText(null);
        ProdQty.setText(null);
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void DeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletebtnMouseClicked

        SelectSeller();
    }//GEN-LAST:event_DeletebtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
      
          
        
            
      try {
        BillTxt.print();

        // Retrieve Grand Total from JLabel
        double GrdTotal = Double.parseDouble(GrdTotallb1.getText().substring(6));

        // Establish MySQL connection
        String url = "jdbc:mysql://localhost:3306/seler";
        String user = "root";
        String password = "";
         conn = DriverManager.getConnection(url, user, password);

        // Insert Grand Total into tblGrd table in MySQL
        String sql = "INSERT INTO tblgrd (TOTAL_SALES, SALE_DATE ,SALE_TIME) VALUES (?, ? , ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setDouble(1, GrdTotal);
        pst.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
        pst.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
        pst.executeUpdate();
        pst.close();
        conn.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }  
     
        
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
       
    }//GEN-LAST:event_PrintBtnMouseClicked
   
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        if(ProdQty.getText().isEmpty() || ProdName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else if(AvailQty <= Integer.valueOf(ProdQty.getText())) {
            JOptionPane.showMessageDialog(this, "Not Enough In Stock");
        } else {
            i++;
            ProdTot = Uprice * Integer.valueOf(ProdQty.getText().trim());
            GrdTotal = GrdTotal + ProdTot;
            totalSum += ProdTot;

            if(i==1){
                BillTxt.setText("=================CITY WALK CAFE=================\n"
                        +"\t"+bill_date.toString()+"\n"
                        +"=====================BILL=====================\n"
                        +"NO\tPRODUCT\tPRICE\tQUANTITY\tTOTAL\n"
                        +i+"\t"+ProdName.getText()+"\t"
                        +Uprice+"\t" 
                        +ProdQty.getText()+"\t"
                        +ProdTot+"\n");
            } else {
                BillTxt.setText(BillTxt.getText()
                        +i+"\t"+ProdName.getText()+"\t"
                        +Uprice+"\t" 
                        +ProdQty.getText()+"\t"
                        +ProdTot+"\n");    
            }

            GrdTotallb1.setText("TOTAL  " + GrdTotal);
            
              /*/ Append GRAND TOTAL once for all items added
        if (i >= 0) {
            BillTxt.append("GRAND TOTAL: " + GrdTotal + "\n");
        } else {
        }*/
      

            // Add row to bills table
            Object[] row = {ProdName.getText(), Uprice, Integer.valueOf(ProdQty.getText()), ProdTot};
            DefaultTableModel bills = (DefaultTableModel) bill.getModel();
            bills.addRow(row);

            update();

           try {
        // Insert row to the bills table in MySQL
        String sql= "INSERT INTO bills (ProdName, PRICE, QUANTITY,SALE_DATE,SALE_TIME) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, ProdName.getText());
        pst.setDouble(2, Uprice);
        pst.setInt(3, Integer.valueOf(ProdQty.getText()));
        pst.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
        pst.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
        pst.executeUpdate();

        // Close the PreparedStatement
        pst.close();

        JOptionPane.showMessageDialog(null, "Data inserted successfully!");
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
        }

      
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked

    }//GEN-LAST:event_AddBtnMouseClicked

    private void CatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbActionPerformed

    private void CatCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatCbMouseClicked

    }//GEN-LAST:event_CatCbMouseClicked

    private void existbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existbtnActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_existbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        new Login().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_logoutbtnActionPerformed
Double rice,avqua,qua,gt;

    private void barcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyPressed
        
          
        
         String bac = barcode.getText();
    
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        try {
            String sql = "SELECT * FROM tblproduct WHERE ProdID = ? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,bac );
            rst = pst.executeQuery();

            ResultSetMetaData Rsm = rst.getMetaData();
            int c = Rsm.getColumnCount();

            DefaultTableModel df = (DefaultTableModel)tblProduct1.getModel();
            df.setRowCount(0);

            while(rst.next()){
                Vector v2 = new Vector();
                for(int i = 1; i <= c; i++) {
                    v2.add(rst.getString("ProdID"));
                    v2.add(rst.getString("ProdName"));
                    v2.add(rst.getString("ProdQty"));
                    v2.add(rst.getString("ProdPrice"));
                    v2.add(rst.getString("ProdCat"));
                    ProdName.setText(rst.getString("ProdName"));
                    ProdPrice.setText(rst.getString("ProdPrice"));
                    
                    // Store the unit price and available quantity in variables
                    Uprice = Double.valueOf(rst.getString("ProdPrice"));
                    AvailQty = Integer.valueOf(rst.getString("ProdQty"));
                }
                df.addRow(v2);
            }
            
            String total = JOptionPane.showInputDialog(this, "Enter Product Quantity..");
            ProdQty.setText(total);

            // Calculate the total price based on the quantity entered by the user
            qua = Double.parseDouble(total);
            ProdTot = Uprice * Integer.valueOf(ProdQty.getText());
            GrdTotallb1.setText("TOTAL  " + GrdTotal);
            
            double gt = 0.0; // Initialize the gt variable to zero
            gt += ProdTot;


        } catch (SQLException ex) {
            Logger.getLogger(sale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
       
        
        
    }//GEN-LAST:event_barcodeKeyPressed

    private void barcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeKeyTyped

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        ProdName.setText(null);
        ProdQty.setText(null);
        ProdPrice.setText(null);
        barcode.setText(null);
        
    }//GEN-LAST:event_ClearBtnActionPerformed
   
    int i = 0;
    double totalSum = 0;     Double Uprice,ProdTot=0.0,GrdTotal=0.0;
     int AvailQty;
     
   public void insertBillData(Connection conn, JTextField ProdName, double Uprice, JTextField ProdQty, double ProdTot) {
    try {
        // Insert row to the bills table in MySQL
        String sql= "INSERT INTO bills (ProdName, PRICE, QUANTITY,SALE_DATE,SALE_TIME) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, ProdName.getText());
        pst.setDouble(2, Uprice);
        pst.setInt(3, Integer.valueOf(ProdQty.getText()));
        pst.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
        pst.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
        pst.executeUpdate();

        // Close the PreparedStatement
        pst.close();

        JOptionPane.showMessageDialog(null, "Data inserted successfully!");
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}  
    
    
  
    
    
    
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
            java.util.logging.Logger.getLogger(sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sale().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JComboBox CatCb;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Filterbtn;
    private javax.swing.JLabel GrdTotallb1;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdPrice;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTextField barcode;
    private javax.swing.JTable bill;
    private javax.swing.JButton existbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTable tblProduct1;
    // End of variables declaration//GEN-END:variables

    private void SelectSeller() {
        
         new sale().setVisible(true);
           this.dispose();
    }

    
}
