
package supermarket;

public class Splash extends javax.swing.JFrame {

   
    public Splash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Myprogress = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Percentage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        myprogress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Myprogress.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("       CITY WALK CAFE");

        Percentage.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Percentage.setForeground(new java.awt.Color(255, 255, 255));
        Percentage.setText("%");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\PHOTOS\\187-1872188_red-shopping-cart-png-transparent-png.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Always Fresh");

        javax.swing.GroupLayout MyprogressLayout = new javax.swing.GroupLayout(Myprogress);
        Myprogress.setLayout(MyprogressLayout);
        MyprogressLayout.setHorizontalGroup(
            MyprogressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myprogress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MyprogressLayout.createSequentialGroup()
                .addGroup(MyprogressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyprogressLayout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addGroup(MyprogressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MyprogressLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(Percentage))
                            .addComponent(jLabel3)))
                    .addGroup(MyprogressLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1))
                    .addGroup(MyprogressLayout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        MyprogressLayout.setVerticalGroup(
            MyprogressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyprogressLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(69, 69, 69)
                .addComponent(Percentage)
                .addGap(132, 132, 132)
                .addComponent(myprogress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Myprogress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Myprogress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
       Splash mySplash = new Splash();
       mySplash.setVisible(true);
       try{
           for(int i = 0; i <=100; i++)
           {
               Thread.sleep(40);
               mySplash.myprogress.setValue(i);
               mySplash.Percentage.setText(Integer.toString(i)+"%");
           }
           
       }catch(Exception e){
           
       }
       new Login().setVisible(true);
       mySplash.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Myprogress;
    private javax.swing.JLabel Percentage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar myprogress;
    // End of variables declaration//GEN-END:variables
}



