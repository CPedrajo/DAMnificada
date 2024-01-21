/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja01.ejercicio2;

/**
 *
 * @author carme
 */
public class Ejercicio2 {

    public static void main(String[] args) {
          int suma=0;
        int []temperatura={10,19,20,14,17,18,13,15,17,18};
        for (int i=0;i<temperatura.length;i++){
          suma+=temperatura[i];
          
        }
        System.out.println("La media es: "+(suma/temperatura.length));
    }
}
