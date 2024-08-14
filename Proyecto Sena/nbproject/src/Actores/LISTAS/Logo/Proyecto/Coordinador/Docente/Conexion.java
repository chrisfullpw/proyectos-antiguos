/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Docente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sante
 */
public class Conexion {
    
    
    
    public static Connection getConexion(){
        
        Connection con = null;
        
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fixnote?useTimezone=true&serverTimezone=UTC","root","");
            //JOptionPane.showMessageDialog(null, "Conectado de manera exitosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "fallo al conectar"+ e.getMessage());
        }
        return con;
}
    
    public static ResultSet getTable(String Consulta){
        Connection con = getConexion();
        Statement st;
        ResultSet datos = null;
        
        try {
            st=con.createStatement();
            datos=st.executeQuery(Consulta);
        } catch (Exception e) {
            System.out.println(e.toString());
            //return datos;
        }
        return datos;
    }
    
    /*
    public static int actualizarRegistro(String[] datos){
    Connection con = null;
        int rsu = 0;
    String sql = "update primertrimestre set "
            +"nota1 = '"+datos[0]+"', "
            +"nota2 = '"+datos[1]+"', "
            +"nota3 = '"+datos[2]+"', "
            +"nota4 = '"+datos[3]+"', "
            +"nota5 = '"+datos[4]+"', "
            +"nota6 = '"+datos[5]+"', "
            +"nota7 = '"+datos[6]+"', "
            +"nota8 = '"+datos[7]+"' "
            +"where id = "+datos[8]+" ;";
    
    if(con == null){
    getConexion();
        Statement st;
        
        
        try {
            st=con.createStatement();
            rsu=st.executeUpdate(sql);
        }catch(SQLException ex){
    ex.printStackTrace();
    }
        
        catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(sql);
    }
        return rsu;
        
    }
 */   
}