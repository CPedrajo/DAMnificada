/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio3;

/**
 *
 * @author DAM112
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       
        Circulo c = new Circulo(); 
        Cuadrado c1 = new Cuadrado ();
        Triangulo t = new Triangulo (); 
        Rombo r= new Rombo(); 
        
        c.identidad();
        System.out.println(c.toString()); 
        c1.identidad();
        System.out.println(c1.toString()); 
        t.identidad();
        System.out.println(t.toString()); 
        r.identidad();
        System.out.println(r.toString()); 
        
        
       
    }
}
