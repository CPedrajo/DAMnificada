/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado;
        int a,b; 
        System.out.println("Introduce a");
        a= new Scanner (System.in).nextInt();
        System.out.println("Introduce b");
        b= new Scanner (System.in).nextInt();
        boolean iguales=a==b;
        System.out.println("Los numeros "+a+" y "+b+" ¿son iguales? "+iguales);
    }
}
