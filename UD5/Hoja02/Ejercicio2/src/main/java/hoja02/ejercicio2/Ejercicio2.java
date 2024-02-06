/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio2;

/**
 *
 * @author carmen
 */
public class Ejercicio2 {

    public static void main(String[] args) {
     Articulo [] ar= new Articulo[10]; 
    for (int i=0; i<ar.length; i++){ // este recorre todo el array. Hace falta un contador para que solo muestre hasta donde hay datos. 
       if(i<(ar.length/2)){ // i=0;i<contador;i++ 
           ar[i]=new Perecedero(2,2024,55, 25.5, "hola");
       } else{
           ar[i]=new EnPromocion(5.5,55,24.5,"hola");
       }
    } 
        for (Articulo ar1 : ar) {
            ar1.datos();
        }
     
    }
}
