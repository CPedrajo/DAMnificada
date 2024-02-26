/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja04.ejercicio1;

/**
 *
 * @author carme
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Publicacion [] p= new Publicacion[5]; 
        p[0]=Publicacion.crear(1);
        p[1]=Publicacion.crear(2);
        
        for (int i=0;i<p.length;i++) {
            System.out.println(p[i].toString());
        }
    }
}
