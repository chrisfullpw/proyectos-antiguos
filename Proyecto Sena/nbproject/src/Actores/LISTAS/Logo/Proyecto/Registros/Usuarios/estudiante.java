
package usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class estudiante extends javax.swing.JFrame {

    
    public estudiante() {
        initComponents();
          this.setTitle("REGISTRATE ESTUDIANTE");
          this.setLocation(350,100);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_nombreU = new javax.swing.JLabel();
        txt_nombresU = new javax.swing.JTextField();
        lbl_apellidoU = new javax.swing.JLabel();
        txt_apellidosU = new javax.swing.JTextField();
        lbl_nidentificacionU = new javax.swing.JLabel();
        txt_nidentificacionU = new javax.swing.JTextField();
        CmB_U = new javax.swing.JComboBox<>();
        lbl_cursoU = new javax.swing.JLabel();
        txt_cursoU = new javax.swing.JTextField();
        lbl_telefonoU = new javax.swing.JLabel();
        txt_telefonoU = new javax.swing.JTextField();
        lbl_usuarioU = new javax.swing.JLabel();
        txt_usuarioU = new javax.swing.JTextField();
        lbl_contraseñaU = new javax.swing.JLabel();
        psw_contraseñaU = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnl_fondo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombreU.setText("Nombres");
        getContentPane().add(lbl_nombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 52, -1, -1));

        txt_nombresU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresUActionPerformed(evt);
            }
        });
        txt_nombresU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresUKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombresU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 121, -1));

        lbl_apellidoU.setText("Apellidos ");
        getContentPane().add(lbl_apellidoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 101, -1, -1));

        txt_apellidosU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosUActionPerformed(evt);
            }
        });
        txt_apellidosU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosUKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellidosU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 121, 121, -1));

        lbl_nidentificacionU.setText("N° identifciacion");
        getContentPane().add(lbl_nidentificacionU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 147, -1, -1));

        txt_nidentificacionU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nidentificacionUActionPerformed(evt);
            }
        });
        txt_nidentificacionU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nidentificacionUKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nidentificacionU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 167, 121, -1));

        CmB_U.setBackground(new java.awt.Color(18, 69, 113));
        CmB_U.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Rector", "Docente", "Coordinador" }));
        CmB_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmB_UActionPerformed(evt);
            }
        });
        getContentPane().add(CmB_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 49, 102, -1));

        lbl_cursoU.setText("Curso");
        getContentPane().add(lbl_cursoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 193, -1, -1));
        getContentPane().add(txt_cursoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 213, 121, -1));

        lbl_telefonoU.setText("Telefono");
        getContentPane().add(lbl_telefonoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 101, -1, -1));

        txt_telefonoU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoUKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefonoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 121, 132, -1));

        lbl_usuarioU.setText("Usuario");
        getContentPane().add(lbl_usuarioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 147, -1, -1));

        txt_usuarioU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarioUKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usuarioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 167, 132, -1));

        lbl_contraseñaU.setText("Contraseña");
        getContentPane().add(lbl_contraseñaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 193, -1, -1));
        getContentPane().add(psw_contraseñaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 213, 132, -1));

        jButton1.setBackground(new java.awt.Color(18, 69, 113));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("volver");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 263, 70, 30));

        jButton2.setBackground(new java.awt.Color(18, 69, 113));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 263, 70, 30));

        pnl_fondo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Tipo de usuario");

        javax.swing.GroupLayout pnl_fondoLayout = new javax.swing.GroupLayout(pnl_fondo);
        pnl_fondo.setLayout(pnl_fondoLayout);
        pnl_fondoLayout.setHorizontalGroup(
            pnl_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fondoLayout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(141, 141, 141))
        );
        pnl_fondoLayout.setVerticalGroup(
            pnl_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fondoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombresUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresUActionPerformed

    private void txt_nombresUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresUKeyTyped
       char c= evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '))evt.consume();  
    }//GEN-LAST:event_txt_nombresUKeyTyped

    private void txt_apellidosUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosUActionPerformed

    private void txt_apellidosUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosUKeyTyped
         char c= evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '))evt.consume();  
    }//GEN-LAST:event_txt_apellidosUKeyTyped

    private void txt_nidentificacionUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nidentificacionUKeyTyped
       char c= evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume(); 
    }//GEN-LAST:event_txt_nidentificacionUKeyTyped

    private void txt_telefonoUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoUKeyTyped
       char c= evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume(); 
    }//GEN-LAST:event_txt_telefonoUKeyTyped

    private void txt_usuarioUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioUKeyTyped
    char c= evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume(); 
    }//GEN-LAST:event_txt_usuarioUKeyTyped

    private void txt_nidentificacionUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nidentificacionUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nidentificacionUActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  try{
            PreparedStatement ppt = cn.prepareStatement("INSERT INTO estudiantes(nombres, apellidos, Nidentificacion, telefono, usuario, contraseña, curso) VALUES(?,?,?,?,?,?,?)");
            ppt.setString(5, txt_usuarioU.getText());
            ppt.setString(6, psw_contraseñaU.getText().toString());
            ppt.setString(1, txt_nombresU.getText());
            ppt.setString(2, txt_apellidosU.getText());
            ppt.setString(4, txt_telefonoU.getText());
            ppt.setString(3, txt_nidentificacionU.getText());
            ppt.setString(7, txt_cursoU.getText());
            ppt.executeUpdate();
           
        }catch(Exception e){
        }
       
     if((txt_nombresU.getText().equals("")) || (txt_apellidosU.getText().equals("")) || (txt_nidentificacionU.getText().equals(""))
             || (txt_cursoU.getText().equals("")) || (txt_usuarioU.getText().equals("")) || (psw_contraseñaU.getText().toString().equals(""))
             || (txt_telefonoU.getText().equals("")))
             { 
                 javax.swing.JOptionPane.showMessageDialog(this, "debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
          txt_nombresU.requestFocus();
             }
    
             else{
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.txt_nombresU.setText("");
        this.txt_apellidosU.setText("");
        this.txt_telefonoU.setText("");
        this.psw_contraseñaU.setText("");
        this.txt_cursoU.setText("");
        this.txt_nidentificacionU.setText("");
        this.txt_usuarioU.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CmB_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmB_UActionPerformed
        txt_nombresU.setText("");
     txt_apellidosU.setText("");
     txt_nidentificacionU.setText("");
     txt_cursoU.setText("");
     txt_usuarioU.setText("");
     psw_contraseñaU.setText("");
     txt_telefonoU.setText("");
         
     String item = CmB_U.getSelectedItem().toString();
        if(null != item)switch (item) {
            case "Rector":
                rector window = new rector();
                window.setVisible(true);
                this.dispose();
                break;
            case "Coordinador":
                coordinador window1 = new coordinador();
                window1.setVisible(true);
                this.dispose();
                break;
            case "Docente":
                docente window2 = new docente();
                window2.setVisible(true);
                this.dispose();
                break;
            case "Estudiante":
                estudiante window3 = new estudiante();
                window3.setVisible(true);
                this.dispose();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_CmB_UActionPerformed

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
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estudiante().setVisible(true);
            }
        });
    }
 Connect123 cc = new Connect123();
    Connection cn=cc.Connect123();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmB_U;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_apellidoU;
    private javax.swing.JLabel lbl_contraseñaU;
    private javax.swing.JLabel lbl_cursoU;
    private javax.swing.JLabel lbl_nidentificacionU;
    private javax.swing.JLabel lbl_nombreU;
    private javax.swing.JLabel lbl_telefonoU;
    private javax.swing.JLabel lbl_usuarioU;
    private javax.swing.JPanel pnl_fondo;
    private javax.swing.JPasswordField psw_contraseñaU;
    private javax.swing.JTextField txt_apellidosU;
    private javax.swing.JTextField txt_cursoU;
    private javax.swing.JTextField txt_nidentificacionU;
    private javax.swing.JTextField txt_nombresU;
    private javax.swing.JTextField txt_telefonoU;
    private javax.swing.JTextField txt_usuarioU;
    // End of variables declaration//GEN-END:variables
}
