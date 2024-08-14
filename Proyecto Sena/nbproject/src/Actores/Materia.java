/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actores;

/**
 *
 * @author sante
 */
public class Materia {
    String Id_Materia;
    String Nombre;

    public Materia(String Id_Materia, String Nombre) {
        this.Id_Materia = Id_Materia;
        this.Nombre = Nombre;
    }

    public String getId_Materia() {
        return Id_Materia;
    }

    public void setId_Materia(String Id_Materia) {
        this.Id_Materia = Id_Materia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
}
