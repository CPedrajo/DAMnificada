/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author carme
 */
public class Triatlon {
    private int dorsal;
    private String nombre;
    private int []puntos; 
public Triatlon(int dorsal, String nombre, int pruebas){
    this.dorsal=dorsal;
    this.nombre=nombre;
    puntos=new int [pruebas];
    
    Scanner t; 
    
    System.out.println("Introduce las puntuaciones de "+nombre);
    int n;
    for (int i=0;i<puntos.length;i++){
    n= new Scanner (System.in).nextInt();
     puntos[i]=n;
    }
}
public Triatlon(){
    Scanner t; 
    System.out.println("Introduce el numero del dorsal: ");
    dorsal=new Scanner (System.in).nextInt();
    System.out.println("Introduce el nombre: ");
    nombre=new Scanner (System.in).nextLine();
    System.out.println("Introduce numero de pruebas: ");
    puntos=new int [new Scanner (System.in).nextInt()];
    int n;
    for (int i=0;i<puntos.length;i++){
      n=new Scanner (System.in).nextInt();  
      puntos[i]=n; 
    }
    
}
public double pMedia(){
    double media=0;
    for (int i=0; i<puntos.length;i++){
        media+=puntos[i];
        
    }media/=puntos.length;
    return media; 
}
public boolean esSeleccionado(){
    boolean clasifica=false;
    for (int i=0; i<puntos.length;i++){
        if (puntos[i]>10){
           clasifica=true; 
        }
    }
    return clasifica;
}
public String mostrar(){
    String cadena= "dorsal: "+dorsal+", nombre: "+nombre+", puntuaciones: ";
    for (int i=0; i<puntos.length;i++){
        cadena+=puntos[i]+", ";
        
    }
    cadena+= "media: "+pMedia();
    return cadena;
}
}
