/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.*;

/**
 *
 * @author xSeizuko
 */
	

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Statement;
//import Actores.Rector;

public class conexion {
    
    Connection conectar=null;
    
    public Connection conexion(){
    
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/fixnote?useTimezone=true&serverTimezone=UTC","root","");
            //JOptionPane.showMessageDialog(null, "Conectado de manera exitosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "fallo al conectar"+ e.getMessage());
        }
        return conectar;
  
    }
    
}