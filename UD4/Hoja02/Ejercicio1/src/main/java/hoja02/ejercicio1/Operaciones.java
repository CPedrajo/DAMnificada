/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Operaciones {
    int []num=new int [5]; 
    
public Operaciones(){
    
    Scanner t;
    System.out.println("Introduce los valores: ");
     
    for (int i=0;i<num.length;i++){
       num[i]=new Scanner (System.in).nextInt();
        
    }
}
public void m1(){
    for(int i=0;i<num.length;i++){
       num[i]*=2; 
    }
    
}
public void mostrar() {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }System.out.print(" ");
    }
public int m2(){
    int suma=0;
   for (int i=0;i<num.length;i+=2){
       suma+=num[i];
   }
   return suma;
}
}
