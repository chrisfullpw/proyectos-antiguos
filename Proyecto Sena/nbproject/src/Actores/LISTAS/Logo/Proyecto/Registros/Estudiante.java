
package Registros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto.MenuRegistro;

@SuppressWarnings("serial")
public class Estudiante extends javax.swing.JFrame {
    String cadena2, cadena3, cadena4, cadena5, cadena6, cadena7, cadena8, cadena9, cadena10;
    Connection con=null;
    Statement stmt=null;
    
    public Estudiante() {
        initComponents();
        this.setTitle("REGISTRATE");
        this.setLocation(400,200);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        fondo = new javax.swing.JPanel();
        lbusuario = new javax.swing.JLabel();
        barra = new javax.swing.JComboBox<>();
        lbnombre = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btenviar = new javax.swing.JButton();
        psw_contraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txt_jornada = new javax.swing.JTextField();
        txt_idinst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_idcurso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        lbusuario.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbusuario.setText("Tipo de Usuario:");

        barra.setBackground(new java.awt.Color(0, 102, 102));
        barra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Coordinador", "Rector", "Docente", " " }));
        barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraActionPerformed(evt);
            }
        });

        lbnombre.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbnombre.setText("Documento:");

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Nombre:");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Apellido:");

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Telefono:");

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Email:");

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Contraseña:");

        btenviar.setBackground(new java.awt.Color(0, 102, 102));
        btenviar.setText("Enviar");
        btenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btenviarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Jornada:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("ID:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("Curso:");

        btnVolver.setBackground(new java.awt.Color(0, 102, 102));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/90px.png"))); // NOI18N

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(lbnombre)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_jornada))))
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btenviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(btnVolver))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel4))
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel5))
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel7))
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)))
                                .addGap(12, 12, 12)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_idinst)
                                    .addComponent(psw_contraseña)
                                    .addComponent(txt_idcurso)
                                    .addComponent(txt_email))))
                        .addContainerGap())
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(lbusuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(85, 85, 85))))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbusuario))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(24, 24, 24)))
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnombre)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(psw_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idinst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btenviar)
                            .addComponent(btnVolver)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
       
    }//GEN-LAST:event_txt_nombreActionPerformed

    @SuppressWarnings("deprecation")
    private void btenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btenviarActionPerformed

        cadena2 = txt_cedula.getText();
        cadena3 = txt_nombre.getText();
        cadena4 = txt_apellido.getText();
        cadena5 = txt_telefono.getText();
        cadena6 = txt_email.getText();
        cadena7 = txt_jornada.getText();
        cadena8 = psw_contraseña.getText();
        cadena9 = txt_idcurso.getText();
        cadena10 = txt_idinst.getText();
                                        
        if((txt_nombre.getText().equals("")) || (txt_apellido.getText().equals("")) || (txt_cedula.getText().equals(""))
            || (psw_contraseña.getText().equals(""))|| (txt_telefono.getText().equals("")) ||
                (txt_email.getText().equals(""))|| (txt_jornada.getText().equals(""))|| (txt_idcurso.getText().equals(""))|| (txt_idinst.getText().equals("")))
             { javax.swing.JOptionPane.showMessageDialog(this, "debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
          txt_cedula.requestFocus();
             } 
        else {
        try {
           
            String url = "jdbc:mysql://localhost:3306/fixnote";
            String usuario = "root";
            String contraseña = "root";
            
             Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
            try {
                stmt.executeUpdate("INSERT INTO Estudiante VALUES('"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena5+"','"+cadena6+"','"+cadena7+"','"+cadena8+"','"+cadena9+"','"+cadena10+"')");
            } catch (SQLException ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
                  System.out.println("Los valores han sido agregados a la base de datos ");
                 
                   
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
           Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( SQLException e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_telefono.setText("");
        this.txt_cedula.setText("");
        this.psw_contraseña.setText("");  
        this.txt_email.setText("");
        this.txt_jornada.setText("");
        this.txt_idcurso.setText("");
        this.txt_idinst.setText("");

        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btenviarActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
          
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
      
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
       
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraActionPerformed
     txt_nombre.setText("");
     txt_apellido.setText("");
     txt_cedula.setText("");
     psw_contraseña.setText("");
     txt_telefono.setText("");
     txt_email.setText("");
     txt_jornada.setText("");
     txt_idcurso.setText("");
     txt_idinst.setText("");
     
     String item = barra.getSelectedItem().toString();
        if(null != item)switch (item) {
            case "Rector":
                Rector window = new Rector();
                window.setVisible(true);
                this.dispose();
                break;
            case "Coordinador":
                Coordinador window1 = new Coordinador();
                window1.setVisible(true);
                this.dispose();
                break;
            case "Docente":
                Docente window2 = new Docente();
                window2.setVisible(true);
                this.dispose();
                break;
            /*case "Estudiante":
                Estudiante window3 = new Estudiante();
                window3.setVisible(true);
                this.dispose();
                break;
            default:
                break;*/
        }
    }//GEN-LAST:event_barraActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        MenuRegistro menu = new MenuRegistro();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Estudiante().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> barra;
    private javax.swing.JButton btenviar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbusuario;
    private javax.swing.JPasswordField psw_contraseña;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_idcurso;
    private javax.swing.JTextField txt_idinst;
    private javax.swing.JTextField txt_jornada;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private void getKeyChar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
