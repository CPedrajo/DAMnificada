/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAM112
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Random r= new Random();
        int c=r.nextInt(10000);
        int intentos=4;
        System.out.println("La combinacion es: "+c);
        Scanner t;
        
        for (int y=1;y<=intentos;y++){
            System.out.println("Introduce la combinacion: ");
            int pin=new Scanner (System.in).nextInt();
            if (pin==c){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente. ");
                y=intentos;
                
            }else{ 
                System.out.println("Lo siento, esa no es la combinacion le quedan "+(intentos-y)+" intentos");
            }
        }
        
       
        
    }
}
