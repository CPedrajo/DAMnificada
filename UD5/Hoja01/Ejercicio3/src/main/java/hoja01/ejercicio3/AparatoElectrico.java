/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio3;

/**
 *
 * @author carme
 */
public class AparatoElectrico {
    private static double consumoTotal; 

    public static double getConsumoTotal() {
        return consumoTotal;
    }
    
    private double potencia;
    private boolean encendido; 

    public AparatoElectrico(double potencia) {
        this.potencia = potencia;
        this.encendido = false;
    }
    
    public void enciende(){
        consumoTotal+=potencia;
        
    }
    public void apagado(){
        consumoTotal-=potencia;
    }
    
    
    
 
}
