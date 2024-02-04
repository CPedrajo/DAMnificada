/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio3;

/**
 *
 * @author carme
 */
public class Ejercicio3 {

    public static void main(String[] args) {
     AparatoElectrico a= new AparatoElectrico(150);
         System.out.println(AparatoElectrico.getConsumoTotal()) ;
     AparatoElectrico a2= new AparatoElectrico(2000);
         System.out.println(AparatoElectrico.getConsumoTotal()) ;
        a.enciende();
        a2.enciende();
         System.out.println(AparatoElectrico.getConsumoTotal()) ;
       a.apagado();
        System.out.println(AparatoElectrico.getConsumoTotal()) ; 
    }
}
