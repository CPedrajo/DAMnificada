/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Alumno {
    private String nombre;
    private double []notas; 
    
public Alumno(String nombre){
    this.nombre=nombre;
    notas= new double [5];
    
    Scanner t;
    System.out.println("Introduce los valores:");
    for (int i=0; i<notas.length;i++){
        notas[i]=new Scanner (System.in).nextDouble();
        
    }
    }
public double menor (){
        double min=notas[0];
        for (int i=0;i<notas.length;i++){
            if (notas[i]<min){
                min=notas[i];
            }
        }
          return min;      
        }

public double mayor(){
    double max=notas[0];
    for (int i=0;i<notas.length;i++){
        if (notas[i]>max){
            max=notas[i];
        }
    }
    return max;
}

public String mostrar(){
    double media=0;
    for (int i=0;i<notas.length;i++){
        media+=notas[i];
    }media/=notas.length;
    String cadena=nombre.toUpperCase()+ " Nota media: "+media;
    return cadena;
}
}

