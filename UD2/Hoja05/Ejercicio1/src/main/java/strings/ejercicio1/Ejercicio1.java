/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package strings.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Restaurante r=new Restaurante(1,1.2);
        System.out.println("tenemos " +r.getNumPlatos()+" platos");
        System.out.println("tenemos " +r.getHuevos()+" huevos");
        System.out.println("tenemos " +r.getChorizo()+" chorizo");
        r.addHuevos(1);
        r.addChorizo(1.2);
        System.out.println("tenemos " +r.getHuevos()+" huevos");
        System.out.println("tenemos " +r.getChorizo()+" chorizo");
        
        System.out.println("tenemos " +r.getNumPlatos()+" platos");
        r.sirvePlato();
        System.out.println("tenemos " +r.getNumPlatos()+" platos");
        System.out.println("tenemos " +r.getHuevos()+" huevos");
        System.out.println("tenemos " +r.getChorizo()+" chorizo");
        
        
        
    }
}
