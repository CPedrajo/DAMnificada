/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings.ejercicio1;

/**
 *
 * @author carme
 */
public class Restaurante {
    
    private int huevos;
    private double chorizo; 
    
public Restaurante (int docenas, double kilos){
    huevos=docenas*12;
    chorizo=kilos*1000;
            }
public int addHuevos(int docenas){
    huevos+=docenas*12;
    return huevos;
}
public double addChorizo(double kilos){
    chorizo+=kilos*1000;
    return chorizo;
}
public int getNumPlatos(){
    int platos = (int) ((chorizo/200)>(huevos/2)?huevos/2:chorizo/200);
    
    return platos;
}
public void sirvePlato(){
    chorizo-=200;
    huevos-=2;
    
}

public int getHuevos() {
        return huevos;
    }

public double getChorizo() {
        return chorizo;
    }



    
}
