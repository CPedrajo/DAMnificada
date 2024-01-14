/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author carmen
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        float euros=teclado.nextFloat();
        float pesetas = euros*166;
        System.out.println("El precio de la vivienda es: "+euros);
        System.out.println("El precio de la vivienda en pesetas es: "+pesetas);
    }
}
