/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio2;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Coche c = new Coche("5948BYM", 20);
        Coche c1= new Coche ("4577KKK");
        System.out.println("El coche 2 después de frenar 10 es: "+c1.frenar(10));
        System.out.println("El coche 1 después de acelerar 80 es: "+c.acelera(80));
        c.letras();
    }
        
}
