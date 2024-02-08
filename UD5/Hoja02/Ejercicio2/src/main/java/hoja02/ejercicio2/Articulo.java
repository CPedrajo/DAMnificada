/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

import static hoja02.ejercicio2.Articulo.enProm;

/**
 *
 * @author carmen
 */
public class Articulo {
    protected int codigo;
    protected double precio;
    protected String descripcion; 

    public Articulo(int codigo, double precio, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

     @Override
    public String toString() {
        return String.format("Articulo: %s Descripcion: %s Precio: %,.2f€ ", codigo, descripcion, precio);
    }
    
    public static String enProm (Articulo[] lista1){
        String cadena= "\nArticulos en promocion: \n\t";
        for (int i=0; i<lista1.length; i++){
           if (lista1[i]instanceof EnPromocion){
               cadena=cadena.concat("\n" +lista1[i].toString());
           } 
        }
        return cadena;
    }
   
   
   
    
}
