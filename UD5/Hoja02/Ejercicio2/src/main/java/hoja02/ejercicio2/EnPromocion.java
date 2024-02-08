/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

/**
 *
 * @author carmen
 */
public class EnPromocion extends Articulo {
    private  double descuento; 

    public EnPromocion(double descuento, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("Descuento final \n", descuento, super.precio-super.precio*descuento/100));
    }

    
    
        
        

    
    
    
}
