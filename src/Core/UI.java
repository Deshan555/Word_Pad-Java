/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import static Core.CMD.excCommand;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javafx.beans.value.ChangeListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Jayashanka Deshan
 */
public class UI extends javax.swing.JFrame {

    File file;
    
    String value;
    
    public UI() 
    {
        
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Pic/pages_64px.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setPreferredSize(new java.awt.Dimension(150, 230));

        jMenuItem1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/copy_23px.png"))); // NOI18N
        jMenuItem1.setText("Copy");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem1);

        jMenuItem4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/cut_23px.png"))); // NOI18N
        jMenuItem4.setText("Cut");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/check_all_23px.png"))); // NOI18N
        jMenuItem5.setText("Select All");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/paste_as_text_23px.png"))); // NOI18N
        jMenuItem6.setText("Paste");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/speech_23px.png"))); // NOI18N
        jMenuItem7.setText("Read Loud");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem7);

        jMenuItem2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/pdf_23px.png"))); // NOI18N
        jMenuItem2.setText("Quick PDF");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/language_23px.png"))); // NOI18N
        jMenuItem3.setText("Quick Translate");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem3);

        jMenuItem8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/uppercase_23px.png"))); // NOI18N
        jMenuItem8.setText("To Uppercase");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseClicked(evt);
            }
        });
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/lowercase_23px.png"))); // NOI18N
        jMenuItem9.setText("To Lowercase");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseClicked(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Pad");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/file_26px.png"))); // NOI18N
        jLabel3.setToolTipText("Open File");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 11, -1, 34));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/new_copy_26px.png"))); // NOI18N
        jLabel5.setToolTipText("Create New File");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 34));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/settings_26px.png"))); // NOI18N
        jLabel6.setToolTipText("Settings");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 11, -1, 34));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/copy_26px.png"))); // NOI18N
        jLabel2.setToolTipText("Copy");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 11, -1, 34));

        save.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/save_26px.png"))); // NOI18N
        save.setToolTipText("Quick Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 11, -1, 34));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/command_line_26px.png"))); // NOI18N
        jLabel7.setToolTipText("Open Command Prompt (CMD)");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 11, -1, 34));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/cut_26px.png"))); // NOI18N
        jLabel10.setToolTipText("Cut");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 11, -1, 34));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/check_all_26px.png"))); // NOI18N
        jLabel9.setToolTipText("Select All");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 11, -1, 34));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/pdf_26px.png"))); // NOI18N
        jLabel8.setToolTipText("Quick Pdf");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 15, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/paste_26px.png"))); // NOI18N
        jLabel1.setToolTipText("Paste");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 11, -1, 34));

        path.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        path.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 660, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/info_26px.png"))); // NOI18N
        jLabel12.setToolTipText("File Info");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 15, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/broom_26px.png"))); // NOI18N
        jLabel11.setToolTipText("Clear All");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 15, 30, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/GettyImages-1135911226-classic-blue.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 60));

        message.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 670, 490, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/GettyImages-1135911226-classic-blue.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1270, 40));

        jScrollPane1.setComponentPopupMenu(menu);

        display.setColumns(20);
        display.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        display.setRows(5);
        display.setAutoscrolls(false);
        display.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));
        display.setComponentPopupMenu(menu);
        jScrollPane1.setViewportView(display);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1270, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        JFileChooser chooser = new  JFileChooser();
        
        chooser.setDialogTitle("Choose A File");
        
        chooser.setFileFilter(new File_Filter(".txt","text Files"));
        
        chooser.setFileFilter(new File_Filter(".py","Python Files"));
        
        chooser.setFileFilter(new File_Filter(".java","java files"));
        
        chooser.setFileFilter(new File_Filter(".c","c files"));
        
        chooser.setFileFilter(new File_Filter(".srt","Srt Subtitle files"));
        
        chooser.setFileFilter(new File_Filter(".html","HTML files"));
        
        chooser.setFileFilter(new File_Filter(".css","CSS files"));
        
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            file = chooser.getSelectedFile();
            
            get_Extension get_data = new get_Extension();
            
            value = get_data.extension(file.toString());
            
            try
            {
                Scanner input = new Scanner(file);
                                
                 setTitle(file.toString());
                
                //path.setText(file.toString());
               
                
                path.setText("File Name : "+file.getName());
                 
                File_Handler get_value = new File_Handler();
                 
                get_value.handle(value,file.toString());

            }
            catch(Exception Error)
            {
                System.out.println(Error);
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        CMD obj_02 = new CMD();
        
        obj_02.excCommand("");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        Settings fram = new Settings();
        
        fram.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        File_Create create = new File_Create();
        
        create.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
        display.paste();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        String text = display.getSelectedText();

        display.setSelectedTextColor(Color.red);

        display.copy();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        String data = display.getText();
        
        Pdf_Genarator fg = new Pdf_Genarator();
        
        fg.setVisible(true);
        
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        display.selectAll();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        
        try
        {        
        FileOutputStream details = new FileOutputStream(file.getAbsoluteFile());

        PrintWriter file = new PrintWriter(details);

        BufferedWriter store = new BufferedWriter(file);

        store.write(display.getText());
                
        store.newLine();

        store.close();

        file.close();
        
        message.setText("Saved Complete !");
        }
        catch(Exception error)
        {
            System.out.println("ERROR : "+error);
        }
    }//GEN-LAST:event_saveMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        
        
        
        File_Info file_info = new File_Info(file.getName(),file.getAbsolutePath(),value,file.length(),file.lastModified(),file.canExecute());
                
        file_info.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        display.copy();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        display.cut();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        display.selectAll();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
        display.paste();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       
        tts_Engine engine = new tts_Engine();
        
        Thread thread = new Thread(engine);
        
        thread.run();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        String data = display.getText();
        
        Pdf_Genarator fg = new Pdf_Genarator();
        
        fg.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        String text = display.getSelectedText();
                
        String URL = "https://translate.google.lk/?hl=en&tab=rT&sl=auto&tl=si&text="+text+"&op=translate";
        
        try
        {
            Open_Url.visit(URL);
        }
        catch(Exception Error)
        {
            System.out.print(Error);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        display.cut();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        display.setText("");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jMenuItem8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseClicked
        

    }//GEN-LAST:event_jMenuItem8MouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        String text = display.getSelectedText().toUpperCase();
        
        display.replaceSelection(text);
        
        //display.setText(text);
        
        System.out.print(text.toUpperCase());
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
        String text = display.getSelectedText().toLowerCase();
        
        display.replaceSelection(text);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        //Nimbus
        
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch(Exception Ex)
        {
            System.out.println(Ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea display;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JMenuItem jMenuItem6;
    public static javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JMenuItem jMenuItem8;
    public static javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPopupMenu menu;
    public static javax.swing.JLabel message;
    public static javax.swing.JLabel path;
    public static javax.swing.JLabel save;
    // End of variables declaration//GEN-END:variables
}
