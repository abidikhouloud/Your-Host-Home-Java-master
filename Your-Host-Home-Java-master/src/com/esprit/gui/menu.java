/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.gui;

import com.esprit.entities.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author pc
 */
public class menu extends javax.swing.JFrame {
    static User user;
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Annuler = new javax.swing.JButton();
        modifier_compte = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Ajouter annonce");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 380, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Modifier annonce");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(770, 380, 170, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Modifier Compte");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 640, 180, 60);

        Annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/gui/button_log_off_100856.jpg"))); // NOI18N
        Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AnnulerMouseReleased(evt);
            }
        });
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        getContentPane().add(Annuler);
        Annuler.setBounds(1060, 20, 50, 50);

        modifier_compte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/gui/220px-Monobook_icon.svg.png"))); // NOI18N
        modifier_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier_compteActionPerformed(evt);
            }
        });
        getContentPane().add(modifier_compte);
        modifier_compte.setBounds(510, 400, 220, 230);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/gui/thumb-final-a1-001.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 140, 220, 220);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/gui/images.jpg"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 140, 220, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/gui/arriere plan.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1160, 870);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
        
        
        Ajouter_offre j = new  Ajouter_offre();
            j.setVisible(true);
            j.setSize(1175, 728);
            j.setLocationRelativeTo(null);
            
         this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
            user=Login.us;
           // System.out.println(user.getId());
         Afficher_annonce j = new  Afficher_annonce();
            j.setVisible(true);
            j.setSize(1175, 728);
            j.setLocationRelativeTo(null);
            
         this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AnnulerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerMouseReleased
        // TODO add your handling code here:
        
        Login j = new  Login();
            j.setVisible(true);
            j.setSize(1175, 728);
            j.setLocationRelativeTo(null);
            
         this.setVisible(false);
    }//GEN-LAST:event_AnnulerMouseReleased

    private void modifier_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier_compteActionPerformed
        // TODO add your handling code here:
        
         modifier_compte_annon j = new  modifier_compte_annon();
            j.setVisible(true);
            j.setSize(1175, 728);
            j.setLocationRelativeTo(null);
            
         this.setVisible(false);
    }//GEN-LAST:event_modifier_compteActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed

        
 InputStream in;
                    try {
                        in = new FileInputStream(new File("‪C:\\Claro.wav"));
                        AudioStream audios = new AudioStream(in);
                        AudioPlayer.player.start(audios);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);

                    }
            
        
        
        
        
        Login  j = new Login() ;
       j.setVisible(true);
       j.setLocationRelativeTo(null);
       j.setSize(1175, 728);
       this.setVisible(false);



// TODO add your handling code here:
    }//GEN-LAST:event_AnnulerActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton modifier_compte;
    // End of variables declaration//GEN-END:variables
}
