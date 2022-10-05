/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import static Core.UI.display;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Jayashanka Deshan
 */
public class Settings extends javax.swing.JFrame implements ActionListener{

    String fonts_[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    
    public Settings() {
        initComponents();
        
        theams.setSelectedItem("Pure White");
        
        size.setSelectedItem("14");
        
        fontbox.setSelectedItem("Yu Gothic UI Semilight");
        
        format.setSelectedItem("FONT.PLAIN");
        
        setIconImage(new ImageIcon(getClass().getResource("/Pic/settings_64px.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        theams = new javax.swing.JComboBox<>();
        size = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        fontbox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        format = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(436, 483));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SETTINGS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 120, 43));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Font Style:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 91, 43));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editor Theme : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, -1, 43));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Font Size : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 91, 43));

        theams.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        theams.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dracula", "White", "Pure White", "Dark" }));
        theams.setBorder(null);
        theams.setFocusable(false);
        theams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theamsActionPerformed(evt);
            }
        });
        getContentPane().add(theams, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 216, 232, 43));

        size.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "16", "18", "20", "22", "24", "26", "28", "30" }));
        size.setBorder(null);
        size.setFocusable(false);
        getContentPane().add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 74, 232, 43));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jButton1.setText("Apply");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 385, 123, 37));

        fontbox.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        fontbox.setModel(new javax.swing.DefaultComboBoxModel<>(fonts_));
        fontbox.setBorder(null);
        fontbox.setFocusable(false);
        getContentPane().add(fontbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 145, 232, 43));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Text Format : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, -1, 43));

        format.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        format.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plain", "Bold", "plain and Ithalic", "Ithalic and Bold" }));
        format.setBorder(null);
        format.setFocusable(false);
        format.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatActionPerformed(evt);
            }
        });
        getContentPane().add(format, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 287, 232, 43));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/GettyImages-1135911226-classic-blue.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String theam = theams.getSelectedItem().toString();
        
        if(theam.equals("Dracula"))
        {
            display.setBackground(new java.awt.Color(102, 102, 102));
            
            UI.display.setForeground(Color.white);
        }
        if(theam.equals("White"))
        {
            UI.display.setBackground(new java.awt.Color(204, 204, 204));
            
            UI.display.setForeground(Color.BLACK);
        }
        if(theam.equals("Pure White"))
        {
            UI.display.setBackground(new java.awt.Color(255, 255, 255));
            
            UI.display.setForeground(Color.BLACK);
        }
        if(theam.equals("Dark"))
        {
            UI.display.setBackground(new java.awt.Color(0, 0, 0));
            
            UI.display.setForeground(Color.white);
        }
        
        String font = fontbox.getSelectedItem().toString();
        
        String font_size = size.getSelectedItem().toString();
                
        String font_format = format.getSelectedItem().toString();
        
        Integer i = Integer.valueOf(font_size);  
        
        if(font_format.equals("Plain"))
        {
            UI.display.setFont(new Font(font,Font.PLAIN,i));
        }
        if(font_format.equals("Bold"))
        {
            UI.display.setFont(new Font(font,Font.BOLD,i));
        }
        if(font_format.equals("Plain"))
        {
            UI.display.setFont(new Font(font,Font.PLAIN,i));
        } 
        if(font_format.equals("Plain"))
        {
            UI.display.setFont(new Font(font,Font.PLAIN,i));
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void theamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theamsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_theamsActionPerformed

    private void formatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> fontbox;
    private javax.swing.JComboBox<String> format;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> size;
    private javax.swing.JComboBox<String> theams;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
