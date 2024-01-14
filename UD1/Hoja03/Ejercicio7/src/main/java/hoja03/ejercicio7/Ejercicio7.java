/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado; 
        int infantil, adulto; 
        System.out.println("Introduzca numero de entradas infantil: ");
        infantil=new Scanner (System.in).nextInt();
        System.out.println("Introduzca numero de entradas de adulto: ");
        adulto=new Scanner (System.in).nextInt();
        
        int total =(int) ((infantil*15.50)+(adulto*20));
        int descuento= (int) (total >=100?total*0.95:total);
        System.out.println("El importe total es: "+total);
        System.out.println("El importe de las entradas con el descuento es: "+descuento);
        
        
       
    }
}
