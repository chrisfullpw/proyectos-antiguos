
package LISTAS;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class conexion {
    public Connection con;
    private String driver ="com.mysql.cj.jdbc.Driver";
    private String stringConnection ="jdbc:mysql://localhost:3306/fixnote";
    private String user ="root";
    private String password ="";
   
    public Connection Conectar(){
        try{
            Class.forName(driver);
            con=DriverManager.getConnection(stringConnection, user, password);
            JOptionPane.showMessageDialog(null, "Conectado de manera exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion con la base de datos ");
            System.out.println(e);
        }
        return con;
} 
}
