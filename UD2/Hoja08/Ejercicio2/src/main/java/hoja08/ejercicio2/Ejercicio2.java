/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja08.ejercicio2;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Libro l=new Libro ("9788499640884","nada", "carmen");
        
        System.out.println("¿es español? "+l.esEspanol());
        System.out.println(l.mostrar());
        
    }
}
