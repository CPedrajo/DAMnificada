/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio4;

/**
 *
 * @author carme
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Alumno a= new Alumno("Carmen Pedrajo"); 
        System.out.println("La nota mas alta es: "+a.mayor());
        System.out.println("La nota más baja es: "+a.menor());
        System.out.println(a.mostrar());
        
    }
}
