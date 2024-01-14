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
        Tarjeta t= new Tarjeta("Carmen", "1234567890", 15463.2);
        t.desbloquea(5948);
        
        t.desbloquea(t.getPin());
        t.pagar(566, t.getPin(), "descripcion", true);
        
    }
}
