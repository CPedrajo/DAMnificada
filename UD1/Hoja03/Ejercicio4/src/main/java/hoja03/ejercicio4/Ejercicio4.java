/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado;
        int seg;
        System.out.println("Introduce unos segundos");
        seg= new Scanner (System.in).nextInt();
        
        int min= seg/60;
        int restoseg=seg%60;
        int horas= min/60;
        int restohora=min%60;
        System.out.println("La cantidad: "+seg+" equivale a "+horas+":"+restohora+":"+restoseg);
        
    }
}
