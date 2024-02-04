/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio1;

/**
 *
 * @author DAM112
 */
public class Pajaro {
    private  String color;
    private int edad; 
    private static int numPajaros;
    
public Pajaro (){
   nuevoPajaro();   
}
public Pajaro(int edad, String color){
    nuevoPajaro();
    this.edad=edad;
    this.color=color; 
}
private static void nuevoPajaro(){
    numPajaros++; 
    
}
public static void muestraPajaro(){
    System.out.println("El numero de pajaros es: "+numPajaros);
}
}
