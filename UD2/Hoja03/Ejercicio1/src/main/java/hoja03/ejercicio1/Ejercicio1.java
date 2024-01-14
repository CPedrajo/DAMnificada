/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Finanzas f= new Finanzas (); 
        Finanzas f2= new Finanzas (1.10);
        System.out.println(f.dolaresToEuros(100));
        System.out.println(f.eurosToDolares(100));
        System.out.println(f2.dolaresToEuros(100));
        
        
    }
}
