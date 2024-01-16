/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja06.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Taller t =new Taller (0,0);
        System.out.println("cantidad de aceite: "+t.getAceite());
        System.out.println("cantidad de ruedas: "+t.getRuedas());
        System.out.println(t.getCambiosTotales());
        System.out.println(t.getCambiosParciales());
        
       t.addAceite(5);
       t.addRuedas(6);
        System.out.println("cantidad de aceite: "+t.getAceite());
        System.out.println("cantidad de ruedas: "+t.getRuedas());
        System.out.println(t.getCambiosTotales());
        System.out.println(t.getCambiosParciales());
       
        t.cambioCompleto();
        System.out.println("cantidad de aceite: "+t.getAceite());
        System.out.println("cantidad de ruedas: "+t.getRuedas());
        System.out.println(t.getCambiosTotales());
        System.out.println(t.getCambiosParciales());
        
        t.cambioParcial();
        System.out.println("cantidad de aceite: "+t.getAceite());
        System.out.println("cantidad de ruedas: "+t.getRuedas());
        System.out.println(t.getCambiosTotales());
        System.out.println(t.getCambiosParciales());
        System.out.println(t.cadenita());
    }
}
