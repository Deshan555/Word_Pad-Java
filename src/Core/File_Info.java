/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import javax.swing.ImageIcon;

/**
 *
 * @author Jayashanka Deshan
 */
public class File_Info extends javax.swing.JFrame {

    
    /*public File_Info() {
        initComponents();
    }*/
    
    public File_Info(String fname,String path,String extinsion,Long size,long date,boolean can) 
    {
        initComponents();
        
        name.setText(fname);
        
        ex.setText(extinsion);
        
        path_.setText(path);
        
        String allocation = String.valueOf(size);
        
        String final_date = String.valueOf(date);
        
        String exe_ = String.valueOf(can);
        
        size_.setText(allocation);
        
        exe.setText(exe_);
        
        mdate.setText(final_date);
    }

    private File_Info() 
    {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Pic/info_64px.png")).getImage());
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    /*public void get_info(String fname)
    {
        name.setText(fname);
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        size_ = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        path_ = new javax.swing.JTextField();
        mdate = new javax.swing.JTextField();
        exe = new javax.swing.JTextField();
        ex = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("File Info");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 100, 47));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("File Extension : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, -1, 42));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("File Name : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 137, 42));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("File Size (byts): ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, 100, 42));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Modification : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 319, 157, 42));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("File Path : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, 137, 42));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Can Executable :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 379, 114, 42));

        size_.setEditable(false);
        size_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        size_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        getContentPane().add(size_, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 259, 299, 42));

        name.setEditable(false);
        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 77, 299, 42));

        path_.setEditable(false);
        path_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        path_.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        getContentPane().add(path_, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 198, 299, 42));

        mdate.setEditable(false);
        mdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        getContentPane().add(mdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 319, 299, 42));

        exe.setEditable(false);
        exe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        getContentPane().add(exe, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 379, 299, 42));

        ex.setEditable(false);
        ex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        getContentPane().add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 138, 299, 42));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/GettyImages-1135911226-classic-blue.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(File_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(File_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(File_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(File_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new File_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ex;
    private javax.swing.JTextField exe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mdate;
    private javax.swing.JTextField name;
    private javax.swing.JTextField path_;
    private javax.swing.JTextField size_;
    // End of variables declaration//GEN-END:variables
}
