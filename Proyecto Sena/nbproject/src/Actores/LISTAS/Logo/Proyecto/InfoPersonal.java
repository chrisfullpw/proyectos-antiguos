/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import LISTAS.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sante
 */
public class InfoPersonal extends javax.swing.JFrame {

    /**
     * Creates new form InfoPersonal
     */
    public InfoPersonal() {
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

        jPanel1 = new javax.swing.JPanel();
        btnDoc = new javax.swing.JButton();
        btnRector = new javax.swing.JButton();
        btnCoor = new javax.swing.JButton();
        btnEstu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDoc.setBackground(new java.awt.Color(0, 102, 102));
        btnDoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDoc.setText("Docente");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, -1));

        btnRector.setBackground(new java.awt.Color(0, 102, 102));
        btnRector.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRector.setText("Rector");
        btnRector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectorActionPerformed(evt);
            }
        });
        jPanel1.add(btnRector, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, -1));

        btnCoor.setBackground(new java.awt.Color(0, 102, 102));
        btnCoor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCoor.setText("Coordinador");
        btnCoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoorActionPerformed(evt);
            }
        });
        jPanel1.add(btnCoor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        btnEstu.setBackground(new java.awt.Color(0, 102, 102));
        btnEstu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEstu.setText("Estudiantil");
        btnEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstuActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/logo4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        btnVolver.setBackground(new java.awt.Color(0, 102, 102));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoorActionPerformed
        try {
            COORDINADOR cor = new COORDINADOR();
            cor.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(InfoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCoorActionPerformed

    private void btnRectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectorActionPerformed
        try {
            RECTOR rec = new RECTOR();
            rec.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(InfoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnRectorActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        try {
            DOCENTE doce = new DOCENTE();
            doce.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(InfoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstuActionPerformed
        try {
            ESTUDIANTE es = new ESTUDIANTE();
            es.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(InfoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEstuActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(InfoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoor;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnEstu;
    private javax.swing.JButton btnRector;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
