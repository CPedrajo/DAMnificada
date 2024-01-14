/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado; 
        int a,b,c,x,y;
        System.out.println("Añade el valor de a");
        a=new Scanner (System.in).nextInt();
        System.out.println("Añade el valor de b: ");
        b= new Scanner (System.in).nextInt(); 
        System.out.println("Añade el valor de c: ");
        c= new Scanner (System.in).nextInt(); 
        System.out.println("Añade el valor de x: ");
        x= new Scanner (System.in).nextInt(); 
        
        y=(int) ((a*Math.pow(x, 2))+(b*x)+c);
        System.out.println(y);
    }
}
