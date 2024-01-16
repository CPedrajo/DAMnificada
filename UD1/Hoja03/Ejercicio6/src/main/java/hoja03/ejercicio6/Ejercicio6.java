/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado;
        int hormigas,arañas,cochi;
        System.out.println("Añade el numero de hormigas");
        hormigas= new Scanner (System.in).nextInt();
        
        System.out.println("Añade el numero de arañas");
        arañas= new Scanner (System.in).nextInt();
        
        System.out.println("Añade el numero de cochinita");
        cochi= new Scanner (System.in).nextInt();
        
        System.out.println("El numero de patas es: "+((arañas*8)+(hormigas*6)+(cochi*14)));
    
    }
}
