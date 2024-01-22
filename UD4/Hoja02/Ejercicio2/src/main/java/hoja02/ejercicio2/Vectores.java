/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Vectores {
    private int []a=new int [5];
    
public Vectores(){
    Scanner t;
    System.out.println("Introduce los valores: ");
    for (int i=0;i<a.length;i++){
        a[i]=new Scanner (System.in).nextInt();
        
    }
}
public int menor(){
    int menor=0;
    for (int i=0;i<a.length;i++){
     if(a[i]<menor){
         menor=a[i];
     } 
    }
    return menor;
}
public int mayor(){
    int mayor=0;
    for (int i=0;i<a.length;i++){
     if(a[i]>mayor){
         mayor=a[i];
     } 
    }
    return mayor;
}
public void media(){
    int suma=0;
    for (int i=0;i<a.length;i++){
       suma+=a[i]; 
    }
    System.out.println("La media es: "+suma/a.length);
}
    


    
}
