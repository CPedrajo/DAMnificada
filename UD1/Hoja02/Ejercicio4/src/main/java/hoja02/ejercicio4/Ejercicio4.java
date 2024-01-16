/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        double altura;
        double base;
        
        
        System.out.println("Introduce la altura: ");
        altura= teclado.nextDouble();
        System.out.println("Introduce la base: ");
        base= teclado.nextDouble();
         
        System.out.println("El area del triangulo es: "+((altura*base)/2));
    }
}
