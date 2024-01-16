/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        CajaAhorro c= new CajaAhorro(); 
        CajaAhorro c2= new CajaAhorro(200); 
        
        c.depositar(50);
        System.out.println("El saldo disponible: "+c.obtenerSaldo());
        c.girar(20);
        System.out.println("El saldo disponible: "+c.obtenerSaldo());
        System.out.println("el numero de transacciones es: "+c.obtenerTransacciones());
        
        System.out.println("El saldo disponible: "+c2.obtenerSaldo());
        System.out.println("el numero de transacciones es: "+c2.obtenerTransacciones());
    }
      
}
