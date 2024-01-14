/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int x= teclado.nextInt();
        int y= teclado.nextInt();
        
        System.out.println("Introduce el primer numero: ");
teclado.nextInt();
       System.out.println("Introduce el segundo numero: ");
        teclado.nextInt();
       System.out.println("x = "+x+" y = "+y);
        System.out.println("x+y= "+(x+y));
        System.out.println("x-y= "+(x-y));
        System.out.println("x*y= "+(x*y));
        System.out.println("x/y= "+(x/y));
        System.out.println("x^y= "+(x^y));
        System.out.println("√x= "+x);
        
    }
}
