/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio2;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Numero n = new Numero();
        Numero n2= new Numero(5);
       n.suma(5);
       n.resta(2);
       n2.suma(5);
       n2.resta(10);
        System.out.println(n.doble());
        System.out.println(n.triple());
        System.out.println(n2.doble());
        System.out.println(n2.triple());
    }
}
