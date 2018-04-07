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
public class Factura {
    
    String fecha;
    int numero;
    double total;
    Producto p[];
    
    public Factura(String date, int number, double tot, Producto p[] ){
    this.fecha = date;
    this.numero = number;
    this.p = p;
    this.total = tot;
    }
    
    public void setTotal(double t){
    this.total = t;
    }
    
    public double getTotal(){
    return this.total;
    }
}
