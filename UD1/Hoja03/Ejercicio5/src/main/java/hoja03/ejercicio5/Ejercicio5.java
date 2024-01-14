/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado;
        int mm, m,cm;
        System.out.println("Introduce la distancia ");
        mm= new Scanner (System.in).nextInt();
        System.out.println("Introduce la distancia ");
        cm= new Scanner (System.in).nextInt();
        System.out.println("Introduce la distancia ");
        m= new Scanner (System.in).nextInt();
        
        int resultado= (mm/10)+(m*100)+cm;
        System.out.println("La suma de los tres es: "+resultado+" centimetros");
       // System.out.println("La suma de las tres longuitudes es: "+((mm/10)+(m*100)+cm));
        
    }
}
