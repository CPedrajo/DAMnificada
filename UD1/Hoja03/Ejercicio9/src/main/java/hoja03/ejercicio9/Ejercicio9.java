/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado;
        float m;
        
        System.out.println("Introduce los metros: ");
        m=new Scanner (System.in).nextFloat();
 
        int cm=(int) (m*100);
        System.out.println("Los cm son: "+cm);
    }
}
