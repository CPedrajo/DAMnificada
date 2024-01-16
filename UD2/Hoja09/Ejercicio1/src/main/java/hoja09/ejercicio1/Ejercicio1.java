/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja09.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner t= new Scanner (System.in);
        
        System.out.println("Introduce una temperatura: ");
        Alarma a=new Alarma(t.nextDouble());
        
        System.out.println(a.comprueba());
        System.out.println("La temperatura es: "+a.getTemperatura());
        a.normaliza();
        System.out.println(a.comprueba());
        System.out.println("La temperatura es: "+a.getTemperatura());
    }
}
