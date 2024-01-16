/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
    Circulo c=new Circulo();
    Circulo c1=new Circulo(10);
    System.out.println("El radio es: "+c.getRadio()); 
    c.setRadio(6.30f);
      
    System.out.println("El radio ahora es: "+c.getRadio()); 
    System.out.println("El radio de c1 es: "+c1.getRadio());
    }
}
