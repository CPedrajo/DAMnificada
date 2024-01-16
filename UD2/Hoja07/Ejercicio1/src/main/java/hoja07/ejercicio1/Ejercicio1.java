/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja07.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Rectangulo r= new Rectangulo();
        System.out.println(r.getAncho()); 
        System.out.println(r.getLargo());
       r.setAncho(15);
       r.setLargo(20);
       System.out.println(r.getAncho()); 
       System.out.println(r.getLargo());
        System.out.println("El area es: "+r.area());
        System.out.println("La diagonal es: "+r.diagonal());
       
    }
}
