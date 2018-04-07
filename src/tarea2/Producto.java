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
public class Producto {
    String name;
    String desc; /*Descripcion del producti*/
    int cantidad;
    double price; /*Precio por unidad*/
    
    public Producto (String nombre, String descr, int cant, double price){
        name = nombre;
        desc = descr;
        cantidad = cant;
        this.price = price;
    }
    
    public void setName(String nombre){
        this.name = nombre;
    }
    public void setDescripcion(String descr){
        this.desc = descr;
    }
    public void setCant(int can){
        this.cantidad = can;
    }
    public void setPrice(double precio){
        this.price = precio;
    }
    public String getName(){
        return this.name;
    }
    public String getDescripcion(){
        return this.desc;
    } 
    public int getCant(){
        return this.cantidad;
    } 
    public double getPrice(){
        return this.price;
    } 
}
