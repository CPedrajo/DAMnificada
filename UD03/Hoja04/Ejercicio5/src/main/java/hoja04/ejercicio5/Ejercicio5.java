/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio5;

import java.util.Random;

/**
 *
 * @author Carmen
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
       Random r= new Random();
       int contador=0;
       int mayor=0, menor=100;
      
       
       for (int x=0;x<10;x++){
           
          int y=r.nextInt(100)+1;// de 0 a 99 + 1, es decir de 1 a 100
           System.out.println("·edad "+(x+1)+": "+y);
           
           if (y>mayor){
            mayor=y;   
           }
           if (y<menor){
            menor=y;   
           }
       }
        System.out.println("La edad menor es: "+menor+" y la edad mayor es: "+mayor);
           
       
    }
}
