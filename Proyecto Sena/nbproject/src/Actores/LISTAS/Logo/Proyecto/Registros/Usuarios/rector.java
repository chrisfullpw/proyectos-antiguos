
package usuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

public class rector extends javax.swing.JFrame {
    Connection con=null;
    Statement stmt=null;
    
    public rector() {
        initComponents();
  this.setTitle("REGISTRATE RECTOR");
  this.setLocation(350,100);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombreR = new javax.swing.JLabel();
        txt_nombreR = new javax.swing.JTextField();
        lbl_apellidoR = new javax.swing.JLabel();
        txt_apellidoR = new javax.swing.JTextField();
        lbl_cedulaR = new javax.swing.JLabel();
        txt_cedulaR = new javax.swing.JTextField();
        lbl_fechaR = new javax.swing.JLabel();
        txt_fechaR = new javax.swing.JTextField();
        lbl_usuarioR = new javax.swing.JLabel();
        txt_usuarioR = new javax.swing.JTextField();
        lbl_contraseñaR = new javax.swing.JLabel();
        lbl_telefonoR = new javax.swing.JLabel();
        txt_telefonoR = new javax.swing.JTextField();
        psw_contraseñaR = new javax.swing.JPasswordField();
        lbl_direccionR = new javax.swing.JLabel();
        lbl_instCR = new javax.swing.JLabel();
        txt_instCR = new javax.swing.JTextField();
        lbl_nitR = new javax.swing.JLabel();
        txt_direccionR = new javax.swing.JTextField();
        txt_nitR = new javax.swing.JTextField();
        lbl_tipousuario = new javax.swing.JLabel();
        panel_fondo = new javax.swing.JPanel();
        CmB_R = new javax.swing.JComboBox<>();
        brn_volver = new javax.swing.JButton();
        btn_enviar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombreR.setText("Nombres");
        getContentPane().add(lbl_nombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 67, -1, -1));

        txt_nombreR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreRActionPerformed(evt);
            }
        });
        txt_nombreR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreRKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 87, 183, -1));

        lbl_apellidoR.setText("Apellidos");
        getContentPane().add(lbl_apellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 113, -1, -1));

        txt_apellidoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoRKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 133, 183, -1));

        lbl_cedulaR.setText("Cedula");
        getContentPane().add(lbl_cedulaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 159, -1, -1));

        txt_cedulaR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaRKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cedulaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 179, 183, -1));

        lbl_fechaR.setText("Fecha de Expedicion");
        getContentPane().add(lbl_fechaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 205, -1, -1));
        getContentPane().add(txt_fechaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 231, 183, -1));

        lbl_usuarioR.setText("Usuario");
        getContentPane().add(lbl_usuarioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 257, -1, -1));
        getContentPane().add(txt_usuarioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 283, 183, -1));

        lbl_contraseñaR.setText("Contraseña");
        getContentPane().add(lbl_contraseñaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 309, -1, -1));

        lbl_telefonoR.setText("Telefono");
        getContentPane().add(lbl_telefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 134, -1, -1));

        txt_telefonoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoRKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 154, 167, -1));
        getContentPane().add(psw_contraseñaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 329, 183, -1));

        lbl_direccionR.setText("Direccion");
        getContentPane().add(lbl_direccionR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        lbl_instCR.setText("Institucion a Cargo");
        getContentPane().add(lbl_instCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 237, -1, -1));
        getContentPane().add(txt_instCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 257, 167, -1));

        lbl_nitR.setText("NIT de la Institucion ");
        getContentPane().add(lbl_nitR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 283, -1, -1));
        getContentPane().add(txt_direccionR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 205, 167, -1));
        getContentPane().add(txt_nitR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 301, 167, -1));

        lbl_tipousuario.setText("Tipo de Usuario");
        getContentPane().add(lbl_tipousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 39, 90, -1));

        panel_fondo.setBackground(new java.awt.Color(255, 255, 255));

        CmB_R.setBackground(new java.awt.Color(18, 69, 113));
        CmB_R.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rector", "Coordinador", "Docente", "Estudiante" }));
        CmB_R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmB_RMouseClicked(evt);
            }
        });
        CmB_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmB_RActionPerformed(evt);
                CmB_R1ActionPerformed(evt);
                CmB_R2ActionPerformed(evt);
                CmB_R3ActionPerformed(evt);
            }
        });

        brn_volver.setBackground(new java.awt.Color(18, 69, 113));
        brn_volver.setForeground(new java.awt.Color(255, 255, 255));
        brn_volver.setText("volver");

        btn_enviar.setBackground(new java.awt.Color(18, 69, 113));
        btn_enviar.setForeground(new java.awt.Color(255, 255, 255));
        btn_enviar.setText("enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panel_fondoLayout = new javax.swing.GroupLayout(panel_fondo);
        panel_fondo.setLayout(panel_fondoLayout);
        panel_fondoLayout.setHorizontalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondoLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(CmB_R, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(brn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        panel_fondoLayout.setVerticalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondoLayout.createSequentialGroup()
                .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_fondoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(CmB_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_fondoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(panel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -1, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
try{
            PreparedStatement ppt = cn.prepareStatement("INSERT INTO rector(usuario, contraseña, nombres, apellidos, telefono, direccion, cedula, fechadeexpedicion, institucionacargo, NITdelainstitucion) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ppt.setString(1, txt_usuarioR.getText());
            ppt.setString(2, psw_contraseñaR.getText().toString());
            ppt.setString(3, txt_nombreR.getText());
            ppt.setString(4, txt_apellidoR.getText());
            ppt.setString(5, txt_telefonoR.getText());
            ppt.setString(6, txt_direccionR.getText());
            ppt.setString(7, txt_cedulaR.getText());
            ppt.setString(8, txt_fechaR.getText());
            ppt.setString(9, txt_instCR.getText());
            ppt.setString(10, txt_nitR.getText());
            
            ppt.executeUpdate();
           
        }catch(Exception e){
        }
     
     if((txt_nombreR.getText().equals("")) || (txt_apellidoR.getText().equals("")) || (txt_cedulaR.getText().equals(""))
             || (txt_fechaR.getText().equals("")) || (txt_usuarioR.getText().equals("")) || (psw_contraseñaR.getText().toString().equals(""))
             || (txt_telefonoR.getText().equals("")) || (txt_direccionR.getText().equals("")) || (txt_instCR.getText().equals(""))
             || (txt_nitR.getText().equals("")))
             { javax.swing.JOptionPane.showMessageDialog(this, "debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
          txt_nombreR.requestFocus();
             } 
     
             else {
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.txt_nombreR.setText("");
        this.txt_apellidoR.setText("");
        this.txt_telefonoR.setText("");
        this.txt_cedulaR.setText("");
        this.psw_contraseñaR.setText(""); 
        this.txt_fechaR.setText("");
        this.txt_usuarioR.setText("");
        this.txt_direccionR.setText("");
        this.txt_instCR.setText("");
        this.txt_nitR.setText("");
    
        
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void txt_nombreRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreRActionPerformed

    private void txt_nombreRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreRKeyTyped
        
        char c= evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '))evt.consume();  
    }//GEN-LAST:event_txt_nombreRKeyTyped

    private void txt_apellidoRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoRKeyTyped
        char c= evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '))evt.consume();  
    }//GEN-LAST:event_txt_apellidoRKeyTyped

    private void txt_cedulaRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaRKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume(); 
    }//GEN-LAST:event_txt_cedulaRKeyTyped

    private void txt_telefonoRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoRKeyTyped
  char c= evt.getKeyChar();
        if((c<'0' || c>'9'))evt.consume(); 
    }//GEN-LAST:event_txt_telefonoRKeyTyped

    private void CmB_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmB_RActionPerformed
     txt_nombreR.setText("");
     txt_apellidoR.setText("");
     txt_cedulaR.setText("");
     txt_fechaR.setText("");
     txt_usuarioR.setText("");
     psw_contraseñaR.setText("");
     txt_telefonoR.setText("");
     txt_direccionR.setText("");
     txt_instCR.setText("");
     txt_nitR.setText("");
     
     String item = CmB_R.getSelectedItem().toString();
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
    }//GEN-LAST:event_CmB_RActionPerformed

    
    private void CmB_RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmB_RMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CmB_RMouseClicked

    private void CmB_R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmB_R1ActionPerformed
  
    }//GEN-LAST:event_CmB_R1ActionPerformed

    private void CmB_R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmB_R2ActionPerformed

    }//GEN-LAST:event_CmB_R2ActionPerformed

    private void CmB_R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmB_R3ActionPerformed
     
    }//GEN-LAST:event_CmB_R3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new rector().setVisible(true);
            }
        });
    }
  Connect123 cc = new Connect123();
    Connection cn=cc.Connect123();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmB_R;
    private javax.swing.JButton brn_volver;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_apellidoR;
    private javax.swing.JLabel lbl_cedulaR;
    private javax.swing.JLabel lbl_contraseñaR;
    private javax.swing.JLabel lbl_direccionR;
    private javax.swing.JLabel lbl_fechaR;
    private javax.swing.JLabel lbl_instCR;
    private javax.swing.JLabel lbl_nitR;
    private javax.swing.JLabel lbl_nombreR;
    private javax.swing.JLabel lbl_telefonoR;
    private javax.swing.JLabel lbl_tipousuario;
    private javax.swing.JLabel lbl_usuarioR;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JPasswordField psw_contraseñaR;
    private javax.swing.JTextField txt_apellidoR;
    private javax.swing.JTextField txt_cedulaR;
    private javax.swing.JTextField txt_direccionR;
    private javax.swing.JTextField txt_fechaR;
    private javax.swing.JTextField txt_instCR;
    private javax.swing.JTextField txt_nitR;
    private javax.swing.JTextField txt_nombreR;
    private javax.swing.JTextField txt_telefonoR;
    private javax.swing.JTextField txt_usuarioR;
    // End of variables declaration//GEN-END:variables

}
