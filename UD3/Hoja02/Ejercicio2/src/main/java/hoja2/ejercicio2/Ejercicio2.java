/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int diames; 
        System.out.println("Introduce un día del mes: ");
        diames=teclado.nextInt();
        String texto; 
        texto=switch(diames%7){
          case 1 -> "Lunes";
          case 2 -> "Martes";     
          case 3 -> "Miercoles"; 
          case 4-> "Jueves"; 
          case 5 -> "Viernes";
          case 6 -> "Sabado";
          case 0 -> "Domingo";
             
             
         default ->"no valido";  
        } ; 
        System.out.println("El día del mes es: "+texto);
                
        
        
    }
}
