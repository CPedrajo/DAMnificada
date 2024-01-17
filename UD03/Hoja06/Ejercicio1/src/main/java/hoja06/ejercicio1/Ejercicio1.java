/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja06.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Tarjeta t=new Tarjeta("Carmen", 657451,254);
        
        System.out.println("El pin es: "+t.getPin());
       t.desbloquea(t.getPin());
       t.pagar(230, t.getPin(), "Patatas", true);
    }
}
