/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Invierno {
    private double []temperaturas;

public Invierno(int n){
    temperaturas= new double [n];
    
    Scanner t;
    System.out.println("Introduce los valores:");
    for (int i=0; i<temperaturas.length;i++){
        temperaturas[i]=new Scanner (System.in).nextDouble();
        
    }
    
}    
public double tempMedia(){
    double media=0;
    for (int i=0;i<temperaturas.length;i++){
        media+=temperaturas[i];
        
    }
    return media/temperaturas.length;
    
}
public double []fahrenheit(){
    double []f= new double[temperaturas.length];
    for (int i=0;i<temperaturas.length;i++){
        f[i]=temperaturas[i]*1.8+32;
    }
    return f;
}
public String mostrar (double[]array){
    String cadena= "[";
    for(int i=0; i<temperaturas.length;i++){
        cadena+=array[i]+" ";
        
    }
    cadena+=" ]";
    return cadena;
}
}
