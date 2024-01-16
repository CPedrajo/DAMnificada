/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja08.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Persona p=new Persona ("Carmen", "Pedrajo", "Rabago", "7215333d");
            
        
        System.out.println("La clave es: "+p.clave());
        System.out.println("¿El dni es valido? "+p.dniValido());
    }
}
