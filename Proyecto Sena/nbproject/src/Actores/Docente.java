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
public class Docente {
   int ID_DOCENTE;
    String nom_doc1;
    String nom_doc2;
    String apell_doc1;
    String apell_doc2;
    int Telefono;
    String Direccion;
    String Email;
    String profesion;
    String contraseña;

    public int getID_DOCENTE() {
        return ID_DOCENTE;
    }

    public void setID_DOCENTE(int ID_DOCENTE) {
        this.ID_DOCENTE = ID_DOCENTE;
    }

    public String getNom_doc1() {
        return nom_doc1;
    }

    public void setNom_doc1(String nom_doc1) {
        this.nom_doc1 = nom_doc1;
    }

    public String getNom_doc2() {
        return nom_doc2;
    }

    public void setNom_doc2(String nom_doc2) {
        this.nom_doc2 = nom_doc2;
    }

    public String getApell_doc1() {
        return apell_doc1;
    }

    public void setApell_doc1(String apell_doc1) {
        this.apell_doc1 = apell_doc1;
    }

    public String getApell_doc2() {
        return apell_doc2;
    }

    public void setApell_doc2(String apell_doc2) {
        this.apell_doc2 = apell_doc2;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    } 
}
