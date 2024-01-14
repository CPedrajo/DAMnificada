/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio2;

/**
 *
 * @author carme
 */
public class Coche {
    private String matricula; 
    private int velocidad; 

public Coche(String matricula, int velocidad){
    this.velocidad=velocidad; 
    this.matricula=matricula; 
}
public Coche (String matricula){
    velocidad=0;
    this.matricula=matricula;
}
public int acelera (int velocidad){
   this.velocidad=this.velocidad+velocidad<=120?this.velocidad+velocidad:120;
   
   return this.velocidad;
}
public int frenar (int velocidad){
   this.velocidad=this.velocidad-velocidad<0?0:this.velocidad-velocidad;
   return this.velocidad;
} 
public void letras (){
    System.out.println("Las letras de la matricula son: "+matricula.substring(4));
}
public void mostrar (){
    System.out.println("La matrícula es: "+matricula+" La velocidad es: "+velocidad);
}
}
