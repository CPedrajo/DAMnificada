/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio7;

/**
 *
 * @author carme
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int a= 23;
        int b=56; 
        int c=a;
 
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
        
        a=b;
        b=c; 
        System.out.println("El valor de a es: "+a);
        System.out.println("El valor de b es: "+b);
    }
}
