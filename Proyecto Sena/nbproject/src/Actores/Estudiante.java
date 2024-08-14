/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actores;

/**
 *
 * @author xSeizuko
 */
public class Estudiante {
    
String ID_estudiante;
String nom_est;
String apell_est;
String telefono;
String email;
String contraseña;

    public Estudiante(String ID_estudiante, String nom_est, String apell_est, String telefono, String email, String contraseña) {
        this.ID_estudiante = ID_estudiante;
        this.nom_est = nom_est;
        this.apell_est = apell_est;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getID_estudiante() {
        return ID_estudiante;
    }

    public void setID_estudiante(String ID_estudiante) {
        this.ID_estudiante = ID_estudiante;
    }

    public String getNom_est() {
        return nom_est;
    }

    public void setNom_est(String nom_est) {
        this.nom_est = nom_est;
    }

    public String getApell_est() {
        return apell_est;
    }

    public void setApell_est(String apell_est) {
        this.apell_est = apell_est;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}