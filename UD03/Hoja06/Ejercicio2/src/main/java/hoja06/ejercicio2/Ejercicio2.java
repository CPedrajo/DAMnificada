/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja06.ejercicio2;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Baraja b= new Baraja(); 
        Baraja b2= new Baraja();
        
        System.out.println(b.getNumero()); 
        System.out.println(b2.getNumero()); 
       if (b.getNumero()>b2.getNumero()){
           System.out.println(b.mostrar());
       }else if(b.getNumero()<b2.getNumero()){
           
           System.out.println(b2.mostrar());
       }else{
           System.out.println("Las cartas tienen el mismo valor");
       }
    }
}
