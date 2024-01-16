/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Calculo {

    public Calculo(){
        
    }
public void m1(){
    int x=10;
    while (x>=0){
        System.out.println(x--);
    } System.out.println("¡DESPEGUE!");
    
}
public void m2(){
    Scanner t;
    int p=0,n=0,nu=0, y=0;
    do {
    System.out.println("Introduce un numero");
    int x=new Scanner (System.in).nextInt();
    if (x>0){
      p++;
      y++;
    }
    else if (x==0){
        nu++;
        y++;
    }
    else if (x<0){
        n++;
        y++;
    }
}while (y<=10);
    System.out.println("Numeros positivos: "+p);
    System.out.println("Numeros negativos: "+n);
    System.out.println("Nulos: "+nu);

    
}
public void m4(){
    Scanner t;
    char x;
    int c=0;
    do {
        System.out.println("Introduce un caracter. (. para salir) ");
        x=new Scanner (System.in).next().charAt(0);
        c++;
    }while (x!='.');
     System.out.println("El numero de intentos es: "+c);
}
public void m5(){
Scanner t;
    int x;
    int c=0;
    int suma=0;
    do {
        System.out.println("Introduce un numero. (negativo para salir) ");
        x=new Scanner (System.in).nextInt();
        c++;
       suma+=x;
    }while (x<0);
     System.out.println("La media es: "+suma/c);
}
}
