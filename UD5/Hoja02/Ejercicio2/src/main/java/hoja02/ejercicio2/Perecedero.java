/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

/**
 *
 * @author carmen
 */
public class Perecedero extends Articulo {
    private int mes, año; 

    public Perecedero(int mes, int año, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.mes = mes;
        this.año = año;
    }

    @Override
    public void datos() {
        super.datos();
        System.out.println("El mes es: "+mes);
        System.out.println("El año es: "+año); 
    }
    
    public void codesc(){
        
    }
   
        
        
       
    
    
}
