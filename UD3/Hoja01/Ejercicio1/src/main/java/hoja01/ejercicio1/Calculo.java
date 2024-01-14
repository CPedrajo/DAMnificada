/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Calculo {
    Scanner t; 
    
    
public void m1(){
    System.out.println("Introduce un número: ");
    int x=new Scanner (System.in).nextInt();
    if (x>=100&&x<=1000){
        System.out.println("El número está comprendido entre 100 y 1000");
              
    }else {
      System.out.println("El número no está comprendido entre 100 y 1000");  
    }  
}

public void m2(){
    System.out.println("Introduce el número: "); 
    int x=new Scanner (System.in).nextInt();
    if (x>0){
        System.out.println("El numero es positivo. ");
        
    }else if(x<0){
        System.out.println("El número es negativo. ");
        
    }else if(x==0){
        System.out.println("EL numero es nulo. ");
    }
}
public void m3 (){
    System.out.println("Introduce el número: "); 
    int x=new Scanner (System.in).nextInt();
    if (x%2==0&&x%5==0){
        System.out.println("El numero es divisible por 2 y 5");
        
    }else {
        System.out.println("El numero no es divisible entre 2 ni 5. ");
    }
}
public void m4(){
    System.out.println("Introduce el número: "); 
    int x=new Scanner (System.in).nextInt();
    if (x%1==0){
        System.out.println("El numero no tiene parte fraccionaria");
    }else {
        System.out.println("El numero tiene parte fraccionaria. ");
    }
}
public void m5(){
   System.out.println("Introduce el número: "); 
    int x=new Scanner (System.in).nextInt();
    if (x>=1900&&x<=2100){
      if( x%4==0||(x%100==0&&x%400!=0)) {
          System.out.println("El numero es bisiesto");   
      } else {
          System.out.println("El numero no es bisiesto");
      }
            
    }else{
        System.out.println("El numero no esta comprendido entre 1900 y 2100");
    }
}
public void m6 (){
    System.out.println("Introduce el número: "); 
    int x=new Scanner (System.in).nextInt();
    if (x%2==0){
        System.out.println("El numero es par");
    }else{
        System.out.println("El numero es impar");
    }
}
public void m7(){
    System.out.println("Introduce el número: "); 
    int x=new Scanner (System.in).nextInt();
    if (x>=1&&x<=10){
        if(x%2==0){
            System.out.println("EL numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }else{
        System.out.println("El numero no está entre el 1 y el 10");
    }
               
}
public void m8(){
     System.out.println("Introduce el número: "); 
    int x=new Scanner (System.in).nextInt();
     System.out.println("Introduce el número: ");
    int y=new Scanner (System.in).nextInt();
     System.out.println("Introduce el número: ");
    int n=new Scanner (System.in).nextInt();
    
    if(x<y&&x<n){
        if (y<n){
            System.out.println("EL minimo es  "+x+" El maximo es: "+n);
        }else{
            System.out.println("El minimo es: "+x+" El maximo es: "+y);
        }
    }else if (y<x&&y<n){
        if (x<n){
            System.out.println("EL minimo es: "+y+" El maximo es: "+n);
        }else{
          System.out.println("El minimo es: "+y+" El maximo es: "+x);  
        }
                
       
    }else if (n<x&&n<y){
        if (x<y){
            System.out.println("EL minimo es: "+n+" El maximo es: "+y);
        }else{
          System.out.println("El minimo es: "+n+" El maximo es: "+x);  
        }
                
       
    }
    
}
public void m9(){
    System.out.println("Introduce el número: "); 
    int x=new Scanner (System.in).nextInt();
     System.out.println("Introduce el número: ");
    int y=new Scanner (System.in).nextInt(); 
    if (x%y==0){
        System.out.println(y+" es divisor de  "+x);
    }
    else if (y%x==0){
        System.out.println(x+" es divisor de "+y);
    }else{
        System.out.println("No son divisores. ");
    }
}
        
}
