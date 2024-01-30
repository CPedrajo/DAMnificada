/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio3;

/**
 *
 * @author carme
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
   Invierno i= new Invierno(5);
      
        System.out.println("la temperatura media es: "+i.tempMedia());
        System.out.println("La temperatura en fahrenheit es: ");
        System.out.println(i.mostrar(i.fahrenheit()));
        
   
    }
}
