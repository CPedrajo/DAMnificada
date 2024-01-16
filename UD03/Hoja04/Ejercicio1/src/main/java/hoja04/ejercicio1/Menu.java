/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Menu {
    

public void m1(){
    Scanner t; 
    System.out.println("Introduce un numero");
    int x=new Scanner (System.in).nextInt();
   if ( x>0){
       for (int i=x-1;i>0;i++){
           if (x%i==0){
             System.out.println(i);  
           }
    }
   }  
}
public void m2(){
    //• Método 2. Pide por teclado dos números enteros N1 y N2 y nos visualiza todos los
//números impares que hay entre ellos, indicando al final cual es la suma de todos ellos.//
Scanner t; 
    System.out.println("Introduce un numero");
     int n1=new Scanner (System.in).nextInt();
     System.out.println("Introduce un numero");
     int n2=new Scanner (System.in).nextInt();
     int suma=0;
     if (n1>n2){
         
         for (int i=n1-1;i>n2;i--){
             if(i%2!=0){
                 System.out.println(i);
                         suma+=i;
             }
         }
     }else if (n1<n2){
         for (int i=n1;i<n2;i++){
             if (i%2!=0){
                 System.out.println(i);
                 suma+=i;
             }
         }
     }
     System.out.println("La suma de los impares es: "+suma);
}
public void m3(){
    Scanner t; 
    System.out.println("Introduce un numero");
    int x=new Scanner (System.in).nextInt();
    if(x%1==0&&x>0){
        for (int i=1;i<=10;i++){
            System.out.println(x+" x "+i+" ="+(x*i));
            
        }
    }
}
}
