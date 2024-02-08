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

    private static double descuento;

    public EnPromocion(double descuento, int codigo, double precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("El descuento es: %,.2f y el precio final es: %,.2f \n", descuento, super.precio - (super.precio * descuento / 100),(super.precio/descuento*100)));
    }

    public static String Promocion(Articulo[] array) {
        int max = 0;
        EnPromocion maximo = null;
        String cadena = "\nEl articulo con más descuento es: \n";
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof EnPromocion promo) {
                if (promo.descuento > max) {
                    max = (int) promo.descuento;
                    maximo = promo;

                }

            }
            
          
        }
        if (maximo == null){
                cadena= " no existen articulos con descuento. ";
              
            }else{ 
               cadena = cadena.concat(maximo.toString());   
            }
        return cadena;
    }

}
