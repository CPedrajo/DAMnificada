/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int diasem; 
        System.out.println("Introduce un día de la semana(1-7) ");
        diasem=teclado.nextInt();
        String texto; 
        texto=switch(diasem){
            case 1 ->"Lunes";
            case 2 ->"Martes"; 
            case 3 ->"Miercoles";
            case 4 ->"Jueves";
            case 5 ->"Viernes";
            case 6 ->"Sábado";
            case 7 ->"Domingo";
            default -> "no valido";
        };
        System.out.println("El dia de la semana es: "+texto);
                
    }
}
