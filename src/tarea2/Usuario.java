/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Daniel Gómez
 */
public class Usuario {
    String username;
    String password;
    String name;
    String lastname;
    public Usuario(String usuario, String pass, String nom, String ape){
        username = usuario;
        password = pass;
        name = nom;
        lastname = ape;
    }
    public void setName(String nombre){
        this.name = nombre; 
    }
    public void setLastname(String ape){
        this.lastname = ape;
    }
    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    
    
}
