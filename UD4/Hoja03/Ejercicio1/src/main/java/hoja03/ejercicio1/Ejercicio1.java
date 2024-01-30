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
       Triatlon t=new Triatlon(5,"Carmen",3);
       Triatlon t1=new Triatlon();
        System.out.println(t.mostrar());
        System.out.println(t.esSeleccionado());
        System.out.println(t1.mostrar());
        System.out.println(t1.esSeleccionado());
    }
}
