/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author carmen
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        double precio=teclado.nextDouble();
        
        System.out.println("El precio sin IVA es: "+precio);
        System.out.println("El precio con IVA es"+precio*1.21);
        System.out.println("El precio con el 10% de descuento es: "+precio*1.10);
       
    }
}
