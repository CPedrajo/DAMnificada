/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja03.ejercicio3;

/**
 *
 * @author carme
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
      Satelite s = new Satelite();
      Satelite s1= new Satelite(160,254,17000); 
      s.printPosicion();
      System.out.println(s.enOrbita());
      s.variarAltura(255);
      s.variarPosicion(25, 587);
       s.printPosicion();
        System.out.println(s.enOrbita()); 
   
      s1.printPosicion();
      System.out.println(s1.enOrbita());
      s1.variarAltura(1000);
      s1.variarPosicion(25, 587);
      s1.printPosicion();
        System.out.println(s1.enOrbita());
    }
}
