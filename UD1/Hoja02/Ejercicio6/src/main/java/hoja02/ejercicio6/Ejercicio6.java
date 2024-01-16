/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        
        System.out.println("El radio es: ");
        double radio=teclado.nextDouble();
        System.out.println("La altura es: ");
        double altura=teclado.nextDouble();
        
        double area = 2*Math.PI*radio*altura; 
        double volumen= Math.PI*Math.pow(radio, 2)*altura; 
        System.out.printf("El area es: %,.2f",area);
        System.out.printf("El volumen es: %,.2f",volumen);
    }
}
