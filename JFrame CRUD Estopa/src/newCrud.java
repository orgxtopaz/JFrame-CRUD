/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2ndyrGroupA
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class newCrud extends javax.swing.JFrame {

    /**
     * Creates new form newCrud
     */
    public newCrud() {

        initComponents();

        JPanel panel;
        JScrollPane ScrollPane;
        JTable table;

        JTableHeader Theader = tableshow.getTableHeader();

        Theader.setBackground(Color.red); // change the Background color
        Theader.setForeground(Color.WHITE); // change the Foreground

//        Theader.setFont(new Font("Tahome", Font.BOLD, 20)); // font name style size
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer())
                .setHorizontalAlignment(JLabel.CENTER); // center header text

//        tableshow.setFont(new Font("Tahome", Font.BOLD, 15));
//          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fntext = new javax.swing.JTextField();
        lntext = new javax.swing.JTextField();
        etext = new javax.swing.JTextField();
        atext = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableshow = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        label1.setText("label1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");
        setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Firstname");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lastname");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        fntext.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));
        fntext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fntextActionPerformed(evt);
            }
        });
        getContentPane().add(fntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 150, -1));

        lntext.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));
        lntext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lntextActionPerformed(evt);
            }
        });
        getContentPane().add(lntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 150, -1));

        etext.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));
        etext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etextActionPerformed(evt);
            }
        });
        getContentPane().add(etext, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 150, -1));

        atext.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));
        atext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atextActionPerformed(evt);
            }
        });
        getContentPane().add(atext, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 150, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupA\\Documents\\NetBeansProjects\\newlife\\images\\usericon.png")); // NOI18N

        jButton1.setText("CRUD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(add)
                .addGap(61, 61, 61)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add)
                .addGap(72, 72, 72))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 450, 290));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        tableshow.setBackground(new java.awt.Color(255, 173, 12));
        tableshow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 86, 222), new java.awt.Color(0, 0, 0), new java.awt.Color(255, 164, 28), new java.awt.Color(149, 162, 247)));
        tableshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Firstname", "Lastname", "Age", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableshow.setGridColor(new java.awt.Color(204, 0, 51));
        tableshow.setSelectionForeground(new java.awt.Color(255, 102, 0));
        jScrollPane2.setViewportView(tableshow);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 450, 220));

        jPanel5.setBackground(new java.awt.Color(244, 195, 65));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\2ndyrGroupA\\Documents\\NetBeansProjects\\newlife\\images\\ph.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -80, 360, 580));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fntextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fntextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fntextActionPerformed

    private void lntextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lntextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lntextActionPerformed

    private void etextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etextActionPerformed

    private void atextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String[] crud = {"RETRIEVE", "UPDATE", "DELETE"};
        int option = JOptionPane.showOptionDialog(null, "PROCEED ON", "PROCEED", 0, JOptionPane.QUESTION_MESSAGE, null, crud, "");

        if (crud[option] == "RETRIEVE") {
            displaydata();
               

        } else if (crud[option] == "UPDATE") {
            new Update().setVisible(true);
            (this).setVisible(false);

        } else if (crud[option] == "DELETE") {
            new DELETE().setVisible(true);
            (this).setVisible(false);
        } else {

            JOptionPane.showMessageDialog(this, "OK OK !");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        // TODO add your handling code here:
        String firstname = fntext.getText();
        String lastname = lntext.getText();
        String age = atext.getText();
        String email = etext.getText();
   

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.24/migz", "migzy","migzy");
            Statement stmt = con.createStatement();
            String query = "INSERT INTO `users` (`firstname`, `lastname`, `age`, `email`) VALUES ('" + firstname + "','" + lastname + "','" + age + "','" + email + "')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "User Added!");

            // ALERT ON DESTINATION RETRIEVE, UPDATE, DELETE,
            String[] crud = {"RETRIEVE", "UPDATE", "DELETE"};
            int option = JOptionPane.showOptionDialog(null, "PROCEED ON", "PROCEED", 0, JOptionPane.QUESTION_MESSAGE, null, crud, "");

            if (crud[option] == "RETRIEVE") {
                displaydata();
               

                

            } else if (crud[option] == "UPDATE") {
                new Update().setVisible(true);
                (this).setVisible(false);

            } else {
                new DELETE().setVisible(true);
                (this).setVisible(false);
            }

            //
            //            String usercrud=JOptionPane.showInputDialog("RETRIEVE/UPDATE/DELETE/");
            //            JOptionPane.showMessageDialog()
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(newCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newCrud().setVisible(true);
            }
        });

    }

    public void displaydata() {
        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/migz", "migzy", "migzy");
            Statement stmt = con.createStatement();
            ResultSet datas = stmt.executeQuery("select * from `users`");
            DefaultTableModel model = (DefaultTableModel) tableshow.getModel();
            while (datas.next()) {
                count = 1;
                model.addRow(new Object[]{datas.getInt("ID"), datas.getString("firstname"), datas.getString("lastname"), datas.getInt("age"), datas.getString("email")});
            }
            if (count == 0) {
                JOptionPane.showMessageDialog(null, "No data found!.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField atext;
    private javax.swing.JTextField etext;
    private javax.swing.JTextField fntext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JTextField lntext;
    private javax.swing.JTable tableshow;
    // End of variables declaration//GEN-END:variables
}