/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja02.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Scanner t; 
        System.out.println("Introduce un numerito del 1 al 7: ");
       int x= new Scanner (System.in).nextInt();
       switch (x){
           case 1,8,15,22,29->{ 
               System.out.println("LUNES");
           }
           case 2,9,16,23,30->{
               System.out.println("MARTES");
           }
           case 3,10,17,24->{
               System.out.println("MIERCOLES");
           }
           case 4,11,18,25->{
               System.out.println("JUEVES");
           }
           case 5,12,19,26->{
               System.out.println("VIERNES");
           }
           case 6,13,20,27->{
               System.out.println("SABADO");
           }
           case 7,14,21,28->{
               System.out.println("DOMINGO");
           }
           default->{
               System.out.println("El numero no existe.");
           }
               
       }
    }
}
