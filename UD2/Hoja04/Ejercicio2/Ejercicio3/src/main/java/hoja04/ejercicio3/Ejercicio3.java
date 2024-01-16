/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio3;

/**
 *
 * @author carme
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
       Monedero m=new Monedero(20);
       m.meter(10.4);
       m.sacar(50);
       System.out.println("La cantidad de dinero que tienes es: "+m.getCantidad());
       m.sacar(30.40);
       System.out.println("La cantidad de dinero que tienes es: "+m.getCantidad());
       
    }
}
