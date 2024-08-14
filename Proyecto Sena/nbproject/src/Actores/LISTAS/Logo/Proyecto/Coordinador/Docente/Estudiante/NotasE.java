/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Estudiante;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import proyecto.Docente.Conexion;
import proyecto.Docente.DocenteIndex;
import proyecto.EstudianteInicio;

/**
 *
 * @author sante
 */
public class NotasE extends javax.swing.JFrame {
    EstudianteInicio estu = new EstudianteInicio();
    String idE=estu.Usuario.getText();
           
    String nombre ="";
    String apellido ="";
    int nota1;
    int nota2;
    int nota3;
    int nota4;
    int nota5;
    int nota6;
    int nota7;
    int nota8;
    int promedio = ((nota1+nota2+nota3+nota4+nota5+nota6+nota7+nota8)/8);
    String Materia;
    String Pnota1 = Integer.toString(nota1);
    String Pnota2 = Integer.toString(nota2);
    String Pnota3 = Integer.toString(nota3);
    String Pnota4 = Integer.toString(nota4);
    String Pnota5 = Integer.toString(nota5);
    String Pnota6 = Integer.toString(nota6);
    String Pnota7 = Integer.toString(nota7);
    String Pnota8 = Integer.toString(nota8);
    Connection cn;
    public String id;
    public NotasE() {
        initComponents();
        txtID.setText(idE);
        //mostrar();
        
        
        
    }
//where materia.nombre = '" + asignatura.getText() + "' and e.jornada = '"+ jornada.getText() +"' and e.id_cursos1 = '"+ curso.getText() +"';")
    private void mostrar(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = Conexion.getTable(" select e.nom_est, e.apell_est, primertrimestre.nota1, primertrimestre.nota2,\n" +
" primertrimestre.nota3, primertrimestre.nota4, primertrimestre.nota5,primertrimestre.nota6,primertrimestre.nota7,primertrimestre.nota8,materia.nombre, primertrimestre.id from ((estudiante as e\n" +
" inner join primertrimestre on primertrimestre.id_est = e.Id_estudiante)\n" +
" inner Join materia on primertrimestre.id_materia1 = materia.id_materia) where materia.nombre = '" + asignatura.getText() + "' and e.jornada = '"+ jornada.getText() +"' and e.id_cursos1 = '"+ curso.getText() +"' and Id_estudiante ='"+txtID.getText()+"';");
        modelo.setColumnIdentifiers(new Object[]{"Nombre","Apellidos","Nota 1", "Nota 2", "Nota 3", "Nota 4","Nota 5", "Nota 6", "Nota 7", "Nota 8", "Materia", "idNota"});
        
        //(3, curso.getText());
        try {
            while(rs.next()){
            modelo.addRow(new Object[]{rs.getString("nom_est"),rs.getString("apell_est"),rs.getString("nota1"),rs.getString("nota2"),rs.getString("nota3"),rs.getString("nota4"), rs.getString("nota5"),rs.getString("nota6"),rs.getString("nota7"),rs.getString("nota8"),rs.getString("nombre"),rs.getString("id")});
            }
            
            //Asigna el modelo a la tabla
            jTableNotas.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNotas = new javax.swing.JTable();
        asignatura = new javax.swing.JTextField();
        jornada = new javax.swing.JTextField();
        curso = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jTableNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "nota 1", "Nota 2", "Nota 3", "Nota 4", "Nota 5", "Nota 6", "Nota 7", "Nota 8", "Materia", "id_nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNotas.setRowHeight(40);
        jScrollPane1.setViewportView(jTableNotas);
        if (jTableNotas.getColumnModel().getColumnCount() > 0) {
            jTableNotas.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableNotas.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableNotas.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTableNotas.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTableNotas.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTableNotas.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTableNotas.getColumnModel().getColumn(6).setPreferredWidth(50);
            jTableNotas.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTableNotas.getColumnModel().getColumn(8).setPreferredWidth(50);
            jTableNotas.getColumnModel().getColumn(9).setPreferredWidth(50);
            jTableNotas.getColumnModel().getColumn(11).setResizable(false);
            jTableNotas.getColumnModel().getColumn(11).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 867, 60));
        jPanel1.add(asignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 167, -1));
        jPanel1.add(jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, -1));

        curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoActionPerformed(evt);
            }
        });
        jPanel1.add(curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 170, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 170, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 70, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("NOTAS DEL ESTUDIANTE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        btnCargar.setBackground(new java.awt.Color(255, 255, 255));
        btnCargar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnSelect.setBackground(new java.awt.Color(255, 255, 255));
        btnSelect.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSelect.setText("VOLVER");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nº Identidad:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Curso:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jornada:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materia:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(226, 226, 226)
                        .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel12)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel12)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 930, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_btnCargarActionPerformed
    
    public void limpiarCajas(){
      
    }
    
    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        this.dispose();
        IndexEstudiante estu = new IndexEstudiante();
        estu.setVisible(true);

    }//GEN-LAST:event_btnSelectActionPerformed

    private void cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

   
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
            java.util.logging.Logger.getLogger(NotasE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotasE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotasE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotasE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotasE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asignatura;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnSelect;
    private javax.swing.JTextField curso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNotas;
    private javax.swing.JTextField jornada;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
