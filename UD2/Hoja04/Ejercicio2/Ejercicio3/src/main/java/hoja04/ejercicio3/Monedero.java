/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja04.ejercicio3;

/**
 *
 * @author carme
 */
public class Monedero {
   private double cantidad;
   private double saldo;
   
public Monedero (double cantidad){
    this.cantidad=cantidad;
}
public void meter (double cantidad){
    this.cantidad+=cantidad;
    saldo++;
    System.out.println("La cantidad añadida es: "+cantidad);
}
public void sacar (double cantidad){
    saldo=cantidad<=saldo?saldo-cantidad:saldo;
    
    saldo++;
    System.out.println("La cantidad añadida es: "+cantidad);
    
}

public double getCantidad() {
        return cantidad;
    }


}
