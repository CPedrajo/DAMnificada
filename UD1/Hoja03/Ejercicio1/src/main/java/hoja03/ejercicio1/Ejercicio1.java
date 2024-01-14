/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
          int base; 
          double IVA; 
        System.out.println("La base imponible es: ");
        base = teclado.nextInt();
        System.out.println("El IVA es: ");
        IVA= teclado.nextDouble();
        System.out.println("La base con el iva es: "+(base*IVA));
        
        
    }
}
