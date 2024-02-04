/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

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
   
    public void datos(){        
        System.out.println("El codigo es: "+codigo);
        System.out.println("EL precio es: "+precio);
        System.out.println("La descripcion es: "+descripcion);
    }
    
}
