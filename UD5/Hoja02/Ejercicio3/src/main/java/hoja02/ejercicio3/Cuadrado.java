/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio3;

/**
 *
 * @author DAM112
 */
public class Cuadrado extends Forma {

    @Override
    public void identidad() { // tb puede ser una clase abstracta
        id= "cuadrado";
    } 

    @Override
    public String toString() {
        return String.format(id); 
    }
    
    
    
}
