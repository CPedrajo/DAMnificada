/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in); 
        System.out.println("Introduce un número positivo");
        int n=teclado.nextInt();
        byte opcion=0;
        
        do{
        Operaciones op=new Operaciones (n);
            System.out.println("Elige una opción: ");
            System.out.println("1. Contar cuantas cifras tiene: ");
            System.out.println("2. Escriba sus primeros 10 multiplos");
            System.out.println("3. ¿Es perfecto?: ");
            System.out.println("4. Salir");
            
        if (op.numero>0){
           opcion = teclado.nextByte();
           switch (opcion){
               case 1->op.cifras();
               case 2->op.multiplos();
               case 3->op.perfecto();
               case 4->System.out.println("Salir");
               default->System.out.println("la opción es INVÁLIDA");
           }
        }else{
            System.out.println("El numero no es positivo");
        }   
            
        }while (opcion!=4);
    }
}
