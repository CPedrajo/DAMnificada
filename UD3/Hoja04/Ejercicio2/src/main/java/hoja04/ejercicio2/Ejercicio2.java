/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAM112
 */
public class Ejercicio2 {

    public static void main(String[] args) {
    Scanner t;
   
    int donaciones=0;
    do{
    System.out.println("Introduce una cantidad: ");
    int x= new Scanner (System.in).nextInt(); 
    donaciones+=x;
    }while (donaciones<=600);
        System.out.println("Enhorabuena. Hemos conseguido el objetivo. ");
      
       
    }
}
