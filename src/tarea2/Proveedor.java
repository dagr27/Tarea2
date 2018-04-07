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
public class Proveedor {
    String name;
    String address;
    String codigo;
    public Proveedor(String name, String address, String codigo){
        this.name  = name;
        this.address = address;
        this.codigo = codigo;
    }
    public void setName(String nombre){
        this.name = nombre; 
    }
    public void setAddres(String dir){
        this.address = dir;
    }
    public void setCod(String cod){
        this.codigo = cod;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getCod(){
        return codigo;
    }
    
    
}
