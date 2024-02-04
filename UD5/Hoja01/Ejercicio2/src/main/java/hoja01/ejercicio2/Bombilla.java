/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio2;

/**
 *
 * @author DAM112
 */
public class Bombilla {
   
    private static Luces luces= Luces.OFF;
    private static Luces bombilla;
    
public Bombilla (){
   bombilla= Luces.ON; 
   
}
public void general(){
    if (bombilla==Luces.OFF){
        bombilla=Luces.ON;
        System.out.println("La bombilla esta encendida. ");
    }else if(bombilla==Luces.ON){
        bombilla=Luces.OFF; 
        System.out.println("La bombilla esta apagada. ");
    }
}
public static void cambio (){
     if (luces==Luces.OFF){
        luces=Luces.ON;
        System.out.println("El interruptor esta encendido. ");
    }else if(luces==Luces.ON){
        luces=Luces.OFF; 
        System.out.println("El interruptor esta apagado. ");
    }
}
public  void luces(){
    if (bombilla==Luces.ON && luces==Luces.ON){
        System.out.println("La bombilla esta luciendo. ");
    }else{
        System.out.println("La bombilla está apagada. ");
    }
}
}
