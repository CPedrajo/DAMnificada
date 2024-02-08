/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja03.ejercicio1;

/**
 *
 * @author DAM112
 */
public abstract class Figura {
    private double radio, altura; 

    public Figura(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }
    
    public abstract double area ();
        
     //  radio*altura 
            
    public abstract double volumen();
}
