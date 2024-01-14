/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio3 {

    public static void main(String[] args) {
            Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce un numero entero: ");
        int entero =teclado.nextInt(); 
        System.out.println("Introduce 1,2 o 3");   
        byte opcion= teclado.nextByte();
        
        double resultado; 
         resultado= switch(opcion){
             case 1 -> Math.pow(entero, 2);
            case 2 -> entero*2;
            case 3 -> Math.sqrt(entero);
            default -> 0;
         };
         System.out.println("La opcion elegida es: "+opcion+ "y el resultado es "+resultado);
                 
        
    }
}
